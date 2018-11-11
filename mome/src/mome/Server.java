package mome;

import java.net.*;
import java.io.*;
import java.util.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Server extends Thread
{
    private DatagramSocket socket;
    
    public Server(int port) throws SocketException
    {
        socket = new DatagramSocket(port);
        socket.setSoTimeout(1000); // 1000ms = 1sec
    }
    
    public void run()
    {
        DatagramPacket answer;
        // creazione di un array di byte della dimensione specificata
        byte[] buffer = new byte[24];//8bit(1Byte)*3=3Byte
        // creazione di un datagram UDP a partire dall’array di byte
        DatagramPacket request = new DatagramPacket(buffer, buffer.length);

        while (!Thread.interrupted())
        {
            try
            {
                // attesa ricezione datagram di richiesta (tempo massimo di attesa: 1s)
                socket.receive(request);
                // costruzione datagram di risposta (identico al datagram di richiesta)
                answer = new DatagramPacket( request.getData(), request.getLength(), request.getAddress(), request.getPort());
                
                String[] array =new String(answer.getData(), answer.getOffset(), answer.getLength()).split(" ");
                String address=array[0];
                Integer consumoAdd=Integer.parseInt(array[1]);
                Integer consumo=0;
                String data=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                String ora=new SimpleDateFormat("HH:mm:ss").format(new Date());
                
                Connection con = null;
                Statement st=null;
                ResultSet rs=null;
                Boolean errore=false;
                
                String url="jdbc:mysql://localhost:3306/";
                String user="root", db="mome", password="";
                try
                {
                    con=(Connection)DriverManager.getConnection(url+db,user,password);
                    //System.out.println("Connessione riuscita.");
                    String sql="SELECT ultima_rilevazione FROM contatori WHERE ip_address='"+address+"'";
                    st=(Statement)con.createStatement();
                    rs=st.executeQuery(sql);
                    while(rs.next())
                        consumo=rs.getInt("ultima_rilevazione");
                }catch(SQLException e)
                {
                    System.err.println("!! Errore: "+e+" !!");
                    errore=true;
                }
                consumo+=consumoAdd;
                try
                {                   
                    con=(Connection)DriverManager.getConnection(url+db,user,password);
                    //System.out.println("Connessione riuscita.");
                    String sql="UPDATE contatori SET ultima_rilevazione='"+consumo+"' WHERE ip_address='"+address+"'";
                    st=(Statement)con.createStatement();
                    st.executeUpdate(sql);
                    sql="INSERT INTO registrazioni(id, contatore_ip, data, consumo) VALUES(NULL, '"+address+"', '"+data+" "+ora+"', '"+consumo+"')";
                    st=(Statement)con.createStatement();
                    st.executeUpdate(sql);
                }catch(SQLException e)
                {
                    System.err.println("!! Errore: "+e+" !!");
                    errore=true;
                }
                
                String stringa="E";//se si è verificato un errore
                if(!errore) stringa=consumo+"";
                byte[] buffer_risposta = new byte[24];//8bit(1Byte)*3=3Byte
                buffer_risposta = stringa.getBytes("UTF-8");
                DatagramPacket risposta = new DatagramPacket(buffer_risposta, buffer_risposta.length);
                // trasmissione datagram di risposta
                answer = new DatagramPacket(risposta.getData(), risposta.getLength(), request.getAddress(), request.getPort());
                socket.send(answer);
            }
            catch (IOException exception)
            {
            }
        }
        socket.close(); // chiusura del socket
    }
}

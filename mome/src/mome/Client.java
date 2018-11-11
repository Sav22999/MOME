package mome;

import java.net.*;
import java.io.*;

public class Client
{
    private DatagramSocket socket;

    public Client() throws SocketException
    {
        socket = new DatagramSocket();
        socket.setSoTimeout(1000); // 1000ms = 1s
    }

    public void close_socket()
    {
        socket.close();
    }
    
    public String sendAndReceive(String request, String host, int port) throws UnknownHostException, IOException, SocketTimeoutException
    {
        byte[] buffer;
        DatagramPacket datagram;
        String answer;
        // indirizzo IP del destinatario del datagram
        InetAddress address = InetAddress.getByName(host);
        
        // verifica chiusura socket
        if(socket.isClosed())
        {
            throw new IOException();
        }
        // trasformazione in array di byte della stringa
        buffer = request.getBytes("UTF-8");
        // costruzione datagram di richiesta
        datagram = new DatagramPacket(buffer, buffer.length, address, port);
        socket.send(datagram); // trasmissione datagram di richiesta
        // attesa ricezione datagram di richiesta (tempo massimo di attesa: 1s)
        socket.receive(datagram);
        // verifica indirizzo/porta provenienza datagram di risposta
        if(datagram.getAddress().equals(address) && datagram.getPort() == port)
        {
            answer = new String( datagram.getData(), 0, datagram.getLength(), "ISO-8859-1");
        }
        else
        {
            throw new SocketTimeoutException();
        }
        return answer;
    }
}

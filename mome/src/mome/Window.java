/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mome;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.DefaultListModel;

/**
 *
 * @author corso
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SimulazioneMome");
        setMaximumSize(new java.awt.Dimension(584, 329));
        setMinimumSize(new java.awt.Dimension(584, 329));
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Inizia lettura");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tempo trascorso: 00:00:00");

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTATORE N1");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTATORE N2");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Intervallo di tempo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 millisecondo", "10 millisecondi", "100 millisecondi", "1 secondo (Default)" }));
        jComboBox1.setSelectedIndex(3);

        jTextField1.setText("192.168.0.1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("192.168.0.2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private DefaultListModel lista1=new DefaultListModel();
    private Integer lettura1=0;
    private DefaultListModel lista2=new DefaultListModel();
    private Integer lettura2=0;
    static int interval;
    static Timer timer;
    Server echoserver;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jButton1.getText()=="Inizia lettura" || jButton1.getText()=="Inizia nuova lettura")
        {
            //se il bottone è uguale a "Inzia lettura" o "Inizia nuova lettura"
            //quindi inizierà il timer
            try
            {
                //lancio il srver
                echoserver = new Server(7);
                echoserver.start();
            }
            catch (IOException exception)
            {
                System.err.println("!! Errore: Il server non può essere avviato automaticamente. !!\n!! Avviarlo manualmente. !!");
            }
            
            Integer intervalloTempo=1000;//imposto l'intervallo di tempo predefinito a 1 secondo
            //imposto l'intervallo di tempo in base alla scelta della combobox
            if(jComboBox1.getSelectedItem()=="1 secondo (Default)") intervalloTempo=1000;
            else if(jComboBox1.getSelectedItem()=="1 millisecondo") intervalloTempo=1;
            else if(jComboBox1.getSelectedItem()=="10 millisecondi") intervalloTempo=10;
            else if(jComboBox1.getSelectedItem()=="100 millisecondi") intervalloTempo=100;
            else if(jComboBox1.getSelectedItem()=="1000 millisecondi") intervalloTempo=1000;
            
            //imposto il bottone come "Termina lettura"
            jButton1.setText("Termina lettura");
            jComboBox1.setEnabled(false);//disabilita il bottone
            
            jTextField1.setEnabled(false);//disabilito le textfield
            jTextField2.setEnabled(false);

            Scanner sc = new Scanner(System.in);
            Integer delay = 0;//tempo di DELAY iniziale
            Integer period = intervalloTempo;//intervallo in millisecondi
            timer = new Timer();
            interval = 1;
            lettura1=0;
            lettura2=0;
            lista1.clear();
            jList1.setModel(lista1);
            lista2.clear();
            jList2.setModel(lista2);
            timer.scheduleAtFixedRate(new TimerTask()
            {
                Integer tempoTrascorso=0;
                Integer ore=0;
                Integer min=0;
                Integer sec=0;
                public void run()
                {
                    //tutto il ciò che deve ripetere
                    
                    tempoTrascorso++;
                    //System.out.println(tempoTrascorso);
                    String contatore="00:00:00";
                    sec++;
                    if(sec>59)
                    {
                        sec=0;
                        min++;
                        if(min>59)
                        {
                            min=0;
                            ore++;
                        }
                    }
                    //stampo l'ora, i minuti e i secondi nella label
                    String h="", m="", s="";
                    if(ore<10) h="0"+ore;
                    else h=""+ore;
                    if(min<10) m="0"+min;
                    else m=""+min;
                    if(sec<10) s="0"+sec;
                    else s=""+sec;
                    contatore="Tempo trascorso: "+h+":"+m+":"+s;
                    jLabel1.setText(contatore);
                    //900 --> 15min*60sec = 900secondi === se il tempo trascorso diviso 15min è uguale a 0, vuol dire che è un multiplo di 15 minuti -> quindi lettura
                    if(tempoTrascorso%900==0)
                    {
                        //genero i numeri random
                        Integer n1, n2;
                        Random random=new Random();
                        Integer consumoMAX=100;
                        n1=random.nextInt(consumoMAX);
                        n2=random.nextInt(consumoMAX);
                        letture(n1, n2);
                    }
                }
            }, delay, period);
        }
        else
        {
            //quando il bottone risulta essere uguale a "Termina lettura"
            jButton1.setText("Inizia nuova lettura");
            timer.cancel();
            jLabel1.setText("[LETTURA TERMINATA] - "+jLabel1.getText());
            jComboBox1.setEnabled(true);
            jTextField1.setEnabled(true);
            jTextField2.setEnabled(true);
            try
            {
                echoserver.interrupt();
                echoserver.join();
            }
            catch (InterruptedException exception)
            {
                //System.err.println("Errore!");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public void letture(Integer num1, Integer num2)
    {
        //ottengo gli ip dalle textfield
        String ipaddress1=jTextField1.getText();
        String ipaddress2=jTextField2.getText();
        String address="127.0.0.1";//ip address del server
        int porta;
        String request, answer;
        Client client, client2;        
        porta = 7;
        
        //IP_ADDRESS(spazio)CONSUMO_DA_AGGIUNGERE
        try
        {
            request=ipaddress1+" "+num1+"   ?";
            client = new Client();
            //credo la risposta inviando la richiesta al server
            answer = client.sendAndReceive(request, address, porta);
            //System.out.println("GUI - Ricevuto in risposta: \"" +answer+"\"");
            
            lettura1++;//incremento la lettura1 e controllo se abbia ricevuto un errore come risposta (E)
            if(!answer.equals("E")) lista1.addElement("Lettura "+lettura1+" - "+answer+"+["+num1+"]");
            else lista1.addElement("Lettura "+lettura1+" - ERRORE");
            jList1.setModel(lista1);
            client.close_socket();

            client2 = new Client();
            request=ipaddress2+" "+num2+"                      ";
            answer = client2.sendAndReceive(request, address, porta);
            //System.out.println("GUI - Ricevuto in risposta: \"" +answer+"\"");
            lettura2++;//incremento la lettura 2
            if(!answer.equals("E")) lista2.addElement("Lettura "+lettura2+" - "+answer+"+["+num2+"]");
            else lista2.addElement("Lettura "+lettura2+" - ERRORE");
            jList2.setModel(lista2);
            client2.close_socket();
        }
        catch (SocketException exception)
        {
            System.err.println("!! Errore: Creazione socket !!");
        }
        catch (UnknownHostException exception)
        {
            System.err.println("!! Indirizzo IP errato !!");
        }
        catch (SocketTimeoutException exception)
        {
            System.err.println("!! Nessuna risposta dal server !!");
        }
        catch (IOException exception)
        {
            System.err.println("!! Errore: Generico di comunicazione !!");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
        
        //impostare le letture precedenti (?) importandole dal database: bisogna anche settare il numero delle letture già presenti
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

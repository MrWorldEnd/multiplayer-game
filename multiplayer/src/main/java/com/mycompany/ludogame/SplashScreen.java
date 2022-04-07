package com.mycompany.ludogame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JFrame;

public class SplashScreen {
	   public static void main(String[] args) throws IOException {
	        JFrame mainf = new JFrame();
	        mainf.setBounds(10,10,1000,600);
	        mainf.setTitle("LUDO GAME IN JAVA");
	        mainf.setResizable(false);
	        mainf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        LUDOMoves ludo = new LUDOMoves();
	        ludo.setFocusable(true);
	        ludo.addKeyListener(ludo);
	        ludo.addMouseListener(ludo);
	        mainf.add(ludo);
	        mainf.setVisible(true);
                
                
                String[] Socketmetadata = {"10.18.112.66","8008"};//adjust to suit computer
                String hostName = Socketmetadata[0];
                int portNumber = Integer.parseInt(Socketmetadata[1]);
                try(Socket echoSocket = new Socket (hostName, portNumber);
                PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {
                LUDOMoves userInput;
                
                }catch (UnknownHostException e) {
                    System.err.println("Can not find Host" + hostName);
                    System.exit(1);
                }catch (IOException e) {
                    System.err.println("Could not ge I/O for he connection to " + hostName);
                    System.exit(1);
                }
	   }
}

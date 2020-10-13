package com.company;
import java.io.*;
import java.net.Socket;


public class Main {

    public static void main(String[] args) throws IOException {

        OutputStream os = null;
        String filename = null;

        TCPServer Servertest = new TCPServer(5555);
        Socket Socketverbindung = Servertest.Socketverbindung();

        InputStream verb = null;

        try{
            verb = Socketverbindung.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(verb));
            String ausgabe = null;
            while((ausgabe = reader.readLine())!= null){
                System.out.println("Empfangen vom Client: " + ausgabe);

            }
        }catch (Exception ex){
            System.err.println("Inputfail");
            System.exit(0);
        }
        try{
            Thread.sleep(5000);
        }catch (Exception ex){
            System.err.println("sleep fail");
            System.exit(0);

        }

    }
}

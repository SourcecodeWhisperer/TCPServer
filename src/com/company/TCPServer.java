package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public int port;
    public ServerSocket server;

    public TCPServer(int port) {
        this.port = port;
        try{
             this.server = new ServerSocket(port);
        }catch (IOException ex){
            System.err.println("Falied create Socket");
            System.exit(0);
        }

    }

    public Socket Socketverbindung(){
        Socket socket = null;
        try{
            socket = server.accept();

        }catch (Exception ex){
            System.err.println("Falied connect socket");
            System.exit(0);
        }

        return socket;
    }


}

package JavaTCP;
import HelloRMI.Client;

import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            int serverPort = 7896;
            ServerSocket listenSocket = new ServerSocket(serverPort);
            while (true){
                Socket clientSocket = listenSocket.accept();
                // once accepts a connection, serversocket produces a socket
                Connection c = new Connection(clientSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

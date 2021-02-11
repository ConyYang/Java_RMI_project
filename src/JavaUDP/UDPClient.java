package JavaUDP;
import java.net.*;
import java.io.*;


public class UDPClient {
    public static void main(String[] args) {
        //args give message contents and server hostname
        DatagramSocket aSocket = null;
        try {
            aSocket = new DatagramSocket(); //use a free local port
            byte[] m = args[0].getBytes(); // a buffer for sending

            InetAddress aHost = InetAddress.getByName(args[1]);
            // translate user-specified hostname to internet address

            int serverPort = 6789;
            // port number to construct a packet

            DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
            aSocket.send(request);
            // send packet using socket method

            byte[] buffer = new byte[1000]; // a buffer for receive
            DatagramPacket reply =  new DatagramPacket(buffer, buffer.length); // a different constructor
            aSocket.receive(reply); // from which port?
            System.out.println("Reply: "+new String(reply.getData()));

        }catch (Exception e){
            System.out.println(e);
        }finally {
            if (aSocket!=null)
                aSocket.close();
        }
    }
}

package JavaTCP;
import javax.xml.crypto.Data;
import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        // args give message contents and server hostname
        Socket s = null;
        try{
            InetAddress aHost = InetAddress.getByName(args[1]);
            // translate user-specified hostname to Internet address
            int serverPort = 7896;
            s = new Socket(aHost, serverPort);
            // bind to remote server and port
            DataInputStream in = new DataInputStream(s.getInputStream());
            // for reading (receiving)
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            // for writing (sending)
            out.writeUTF(args[0]);
            // string sent is encoded in Unicode Text Format
            String data = in.readUTF(); // read from server
            System.out.println("Received: "+data);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(s!=null)
                s.close();
        }
    }
}

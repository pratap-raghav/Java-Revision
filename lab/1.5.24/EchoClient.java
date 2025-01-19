import java.io.*;
import java.net.*;

public class EchoClient {
    public static final int MAXCOUNT = 1024;
    
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 5000);
            System.out.println("Connected to server");
            
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter outToServer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            System.out.print("Enter message to send to server: ");
            String msg = userInput.readLine();
            System.out.println("Sending to server...");
            outToServer.println(msg);
            
            long startTime = System.nanoTime(); 
            String blanmsg = inFromServer.readLine();
            long endTime = System.nanoTime();
            
            System.out.println("Server response: " + blanmsg);
            
            long rtt = (endTime - startTime) / 1000000;
            System.out.println("Round trip time (RTT) from client to server: " + rtt + " ms");
            
            socket.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;
import java.net.*;

public class EchoServer {
    public static final int MAXCOUNT = 1024;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Listening on port 5000...");
            
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());
                
                Thread clientThread = new Thread(new ClientHandler(clientSocket));
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    static class ClientHandler implements Runnable {
        private Socket clientSocket;
        
        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }
        
        @Override
        public void run() {
            try {
                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter outToClient = new PrintWriter(clientSocket.getOutputStream(), true);
                
                String clientMessage = inFromClient.readLine();
                System.out.println("Received from client: " + clientMessage);
                outToClient.println(clientMessage); 
                
                long startTime = System.nanoTime(); 
                clientSocket.close();
                long endTime = System.nanoTime(); 
                
                long rtt = (endTime - startTime) / 1000000; 
                System.out.println("Round trip time (RTT) from server to client: " + rtt + " ms");
                System.out.println("Client connection closed.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

import java.io.*;
import java.net.*;

public class hello_server {
    public static void main(String[] args) {
        int port = 5000;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server listening on port " + port);

            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket.getInetAddress().getHostAddress());

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String message;
            while ((message = input.readLine()) != null) {
                System.out.println("Received from client: " + message);
            }

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

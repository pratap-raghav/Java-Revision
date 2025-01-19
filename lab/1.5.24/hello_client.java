import java.io.*;
import java.net.*;

public class hello_client {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1";
        int serverPort = 5000;

        try {
            Socket socket = new Socket(serverAddress, serverPort);
            System.out.println("Connected to server.");

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            System.out.print("Enter message to send to server: ");
            String message = userInput.readLine();

            // Send message to server
            writer.println(message);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

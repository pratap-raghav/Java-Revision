import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 5000;

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter message to send to server: ");
            String message = userInput.readLine();
            byte[] sendData = message.getBytes();
            

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            clientSocket.send(sendPacket);

            // Receive echoed message from the server
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String echoedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server response: " + echoedMessage);

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

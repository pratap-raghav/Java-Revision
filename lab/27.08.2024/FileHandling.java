import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "example.txt";
        Scanner sc = new Scanner(System.in);

        // Getting user input to write to the file
        System.out.print("Enter text to write to the file: ");
        String userInput = sc.nextLine();

        // Writing to a file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(userInput);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing.");
            e.printStackTrace();
        }

        // Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading.");
            e.printStackTrace();
        }

        sc.close();
    }
}

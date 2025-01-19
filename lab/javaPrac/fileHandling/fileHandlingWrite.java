import java.io.FileWriter;
import java.io.IOException;

public class fileHandlingWrite{
	public static void main(String[] args){
		try{
			FileWriter writeObject = new FileWriter("textFile.txt");
			writeObject.write("Hello world!!!\nJava File Handling test.");
			writeObject.close();
			System.out.println("Data successfully written");
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}	
}

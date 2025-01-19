import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class fileHandlingRead{
	public static void main(String[] args){
		File fileObject = new File("textFile.txt");
		try{
			Scanner fileReader = new Scanner(fileObject);
			while (fileReader.hasNextLine()) {
				String data = fileReader.nextLine();
				System.out.println(data);
			}
			fileReader.close();
        	}
        	catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}

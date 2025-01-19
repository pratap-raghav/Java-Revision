import java.io.File;
import java.io.IOException;

/*
Create a file.
Write into the file.
Read from the file.
Close the file.
Delete the file.
*/

public class fileHandlingCreate{
	public static void main(String[] args){
		File fileObject = new File("textFile.txt");
		try{
			if(fileObject.createNewFile()){
				System.out.println("File Created: "+fileObject.getName());
			}
			else{
				System.out.println(fileObject.getName() + ": File already exists");
			}
		}
		
		
		
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
        	}
		
	}
}

import java.io.File; 

public class fileHandlingDelete{
	public static void main(String[] args){
	
		File fileObject = new File("textFile.txt");
		if (fileObject.delete()) {
			System.out.println(fileObject.getName() + ": File deleted successfully.");
		}
		else {
			System.out.println("Some error occured, unable to delete file.");
		}
	}
}

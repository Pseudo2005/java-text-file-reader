import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;  
  
public class TextFileReader {  
   public static void main(String[] args) {  
      // Specify the file path and name  
      String filePath = "sample_text_file.txt";  
  
      // Create a File object  
      File file = new File("C:\\Users\\NITIN\\OneDrive\\Desktop\\file reader\\scr\\sample_text_file (1).txt");  
  
      try {  
        // Create a Scanner object to read the file  
        Scanner scanner = new Scanner(file);  
  
        // Read the file line by line  
        while (scanner.hasNextLine()) {  
           String line = scanner.nextLine();  
           System.out.println(line);  
        }  
  
        // Close the Scanner object  
        scanner.close();  
      } catch (FileNotFoundException e) {  
        System.out.println("File not found: " + filePath);  
      }  
   }  
}
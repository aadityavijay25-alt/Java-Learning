import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String filePath = "C:\\Users\\Dell\\OneDrive\\Desktop\\test.txt";
        String textContent = "I like Pizza!\nWould you buy for me?";


        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}

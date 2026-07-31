import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try(FileWriter writer = new FileWriter("test.txt")){

            writer.write("I like Pizza!");
            System.out.println("File has been written");
        }
        catch(IOException e){
            System.out.println("Could not read file");
        }
    }
}

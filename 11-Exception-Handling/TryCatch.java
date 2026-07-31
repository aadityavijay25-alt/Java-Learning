// import java.util.InputMismatchException;
// import java.util.Scanner;
import java.util.*;

public class TryCatch {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        
        try{
            System.out.print("Enter a no.: ");
            int n = sc.nextInt();
            System.out.println(n);
        }
        catch(InputMismatchException e){
            System.out.println("That wasn't a no.");

        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero");
        }

        finally{
            sc.close();
        }

    }
    
}

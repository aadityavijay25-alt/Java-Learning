// //Temperature Converter
import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         double temp;
//         double newTemp;
//         String unit;

//         System.out.print("Enter Temp. :");
//         temp = sc.nextInt();
//         System.out.print("Enter the Unit :");
//         unit = sc.next().toUpperCase(); 
        
//        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32;
//        System.out.println(newTemp + unit);
//     }
    
// }

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0;
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        while(age<0){
            System.out.println("Age cannot be negative!!");
            System.out.println("Enter your age: ");
            age = sc.nextInt();
        }
        System.out.println("You are " +age+ " Years old");
    }
}
//Guess the No. Game
import java.util.*;
// public class Main {
//     public static void main(String[] args){
//         //MINI PROJECT
//         Scanner sc = new Scanner(System.in);
//         int myNumber = (int)(Math.random()*100);
//                    int userNumber = 0;

//         do {
//             System.out.println("Guess My number : ");
//             userNumber = sc.nextInt();

 
//             if(userNumber == myNumber){
//                 System.out.println("GOT IT!... CORRECT");
//                 break;
//             }
//             else if(userNumber > myNumber){
//                 System.out.println("Your number is large");
//             }
//             else{
//                 System.out.println("Your number is small");
//             }
//         } while (userNumber >= 0);
//         System.out.println("My number was : ");
//         System.out.println(myNumber);

//     }
// }


// public class Main{
//     public static void main(String[] args) {
//         double result;
//         result = Math.pow(2,3);
//         result = Math.abs(-4);
//         result = Math.sqrt(64);
//         result = Math.round(3.12);
//         System.out.println(result);
//     }
// }
// Practice Qs
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//      double a;
//      double b;
//      double c;

//      System.out.println("Enter the length of side a :");
//      a = sc.nextDouble();
//      System.out.println("Enter the length of side b :");
//      b = sc.nextDouble();

//      c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//      System.out.println(c);

//      sc.close();
//     }
// }

public class MiniProject{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double area;
        double radius;

        System.out.println("Enter the radius :");
        radius = sc.nextDouble();

        area = Math.PI * Math.pow(radius,2);
        System.out.println(area);
        sc.close();
    }
}
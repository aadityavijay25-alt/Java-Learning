import java.util.*;
public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your Age: ");
        age = sc.nextInt();
        
        if(ageCheck(age)){
            System.out.println("You May Sign up!");
        }else{
            System.out.println("Not Eligible!!");
        }
    }
    static boolean ageCheck(int age){
        if(age>=18){
           return true;
        }else {
          return false;
        }
    }
    
}

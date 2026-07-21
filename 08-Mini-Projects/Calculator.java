import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        char operator;
        double num2;
        double result =0;
        boolean validOperation = true;

        System.out.println("Enter num 1 :");
        num1 = sc.nextDouble();

        System.out.println("Enter a Operator:");
        operator = sc.next().charAt(0);

        System.out.println("Enter num 2 :");
        num2 = sc.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> {
                if(num2 ==0){
                    System.out.println("Cannot divide by Zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '*' -> result = num1 * num2;
            case '%' -> result = num1 % num2;
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operator!!");
                validOperation = false;
            }
        }
        if (validOperation == true){
            System.out.println(result);
        }




        








    }
    
}

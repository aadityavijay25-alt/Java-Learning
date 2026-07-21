import java.util.Random;

public class question{
    public static void main(String [] args){
        // Random random = new Random();
        // int number;
        // number = random.nextInt(1,6);
        // System.out.println(number);
        boolean isStudent = true;
        boolean isSenior;
        double price = 20;

        if(isStudent){
            System.out.println("You get 10% discount!");
            price *= 0.9;
        }
        else {
            price *= 1;
        }
        System.out.printf("The price is : $%.2f" , price);
    }

}
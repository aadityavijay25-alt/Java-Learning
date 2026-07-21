import java.util.Scanner;
import java.util.Random;

public class guessGame {
    public static void main(String[] args){
        Random random = new Random(); 
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;
        int randomNum = random.nextInt(1,101);

        System.out.println("Number Guessing Game!");
        System.out.println("Guess a number between 1-100: ");
        

         do{
            System.out.print("Enter a Guess: ");
            guess = sc.nextInt();
            attempts++;

             if(guess>randomNum){
            System.out.println("Too High Try Again !!");
        }else if(guess<randomNum){
                System.out.println("Too Low Try Again !!");
            } else {
                System.out.println("You Gotcha !! Correct No. is: " +randomNum);
                System.out.println("# of attemps:" + attempts);
            }

        }while(guess != randomNum);       
    }


}  


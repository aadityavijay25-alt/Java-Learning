import java.util.*;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        Random random = new Random();
        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain ="Y";

        do{
        System.out.print("Enter your Move: ");
        playerChoice = sc.nextLine();

        if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                        System.out.println("Invalid Choice !!");
                        continue;
                    }
        
        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computers choice: " + computerChoice);

        if(playerChoice.equals(computerChoice)){
            System.out.println("It's a Tie!");
        } else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) || 
                  (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                   (playerChoice.equals("paper") && computerChoice.equals("rock")) ){
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }

        System.out.println("Play again (Y/N): ");
        playAgain = sc.nextLine();

        } while(playAgain.equals("Y"));

        System.out.println("Thanks for Playing!");

    }
    
}

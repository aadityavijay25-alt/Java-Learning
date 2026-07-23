import java.util.*;
public class quizGame {
    public static void main(String[] args) {
        String[] questions = {"What is the main function of router?",
                              "Which part of the computer is considered the Brain?",
                              "Who is known as father of computer?",
                              "What year Google was launched?",
                              "What was the First Programming language?" };

         String[][] options = {{"1.Storing Files","2.Encrypting Data","3.Directing internet traffic","4.Managing Passwords"},
                               {"1.GPU","2.Hard Drive","3.RAM","4.CPU"},
                               {"1.Steve Jobs","2.Alan Turing","3.Bill Gates","4.Charles Babbage"},
                               {"1.1998","2.2000","3.2004","4.1995"}, 
                               {"1.COBOL","2.Fortran","3.C","4.Assembly"}};    
        
         int[] answers = {3,4,4,1,2};
         int score =0;
         int guess;  
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to the JAVA Quiz Game!");

         for(int i =0; i<questions.length; i++){
            System.out.println(questions[i]);
            for(String option: options[i]){
                System.out.println(option);

            }
            System.out.print("Enter your Guess: ");
            guess = sc.nextInt();

            if(guess == answers[i]){
                System.out.println("CORRECT!");
                score++;
            } else {
                System.out.println("WRONG!!");
            }
            System.out.println("Your Final Score is: " + score + " out of " + questions.length);
         
        }
         
    }
    
}

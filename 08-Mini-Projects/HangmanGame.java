import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        String word = "king";

        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i<word.length(); i++){
            wordState.add('_'); 
        }

        System.out.println("Welcome to Java Hangman!");

        while(wrongGuesses < 6){

            System.out.println(getHangmanArt(wrongGuesses));
            System.out.print("Word: ");
        for(char c: wordState){
            System.out.print(c + " ");
        }

        System.out.println();
        
        System.out.print("Guess a letter: ");
        char guess = sc.next().toLowerCase().charAt(0);

        if(word.indexOf(guess) >= 0){
            System.out.println("Correct guess!");

            for(int i=0; i<word.length(); i++){
                if(word.charAt(i) == guess){
                    wordState.set(i, guess);
                }
            }
        } else {
            wrongGuesses++;
            System.out.println("Wrong guess!!");
        }
        }
        if(wrongGuesses >= 6){
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.println("GameOver!!");
            System.out.println("The word was: " + word);
        }
        

    }
    static String getHangmanArt(int wrongGuesses){  

        return switch(wrongGuesses){
            case 0 -> """
                    


                    """;
            case 1 -> """
                    O


                    """;

            case 2 -> """
                    O
                    |

                    """;
            case 3 -> """
                    O
                  / |

                    """;
            case 4 -> """
                    O
                  / | \\

                    """;
             case 5 -> """
                    O
                  / | \\
                   /
 
                    """;
            case 6 -> """
                    O
                  / | \\
                   / \\
 
                    """;     
            default -> "";                         

        };
    }
    
}

import java.util.*;
public class nestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int cols;
        char symbol;

        System.out.print("Enter no. of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter no. of cols: ");
        cols = sc.nextInt();
        System.out.print("Enter a Symbol: ");
        symbol = sc.next().charAt(0);

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(symbol);
                }
                System.out.println();

        }
        

    }
    
}

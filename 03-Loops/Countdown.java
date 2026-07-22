import java.util.*;
public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Countdown start from? :");
        int start = sc.nextInt();

        for(int i=start; i>0; i--){
            System.out.println(i);
        }
        System.out.println("Happy New Year!");
    }
    
}

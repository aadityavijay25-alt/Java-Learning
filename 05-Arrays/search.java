import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {1,4,5,8,7,6};
        System.out.print("Enter a no.: ");
        int target = sc.nextInt();
        boolean isFound = false;
        for(int i =0 ; i < numbers.length; i++){
            if (target == numbers[i]){
                System.out.println();

            System.out.println("Element fount at index: " + i);
            isFound =true;
            break;
            }
            
        }
        if(!isFound){
            System.out.println("Not in Array");
        }
    }    
}

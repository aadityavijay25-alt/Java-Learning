import java.util.*;
public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the # of food you would like: ");
        int numOfFoods = sc.nextInt();
        sc.nextLine();

        for(int i=1; i<=numOfFoods; i++){
            System.out.print("Enter the #" +i+ ":");
            String food = sc.nextLine();
            foods.add(food);
        }
        System.out.println(foods);
    }
    
}

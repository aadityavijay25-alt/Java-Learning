import java.util.*;
public class shoppingCart{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  item;
        double price;
        int quantity;
        char currency ='$';
        double total;

        System.out.print("What item would you like to buy: ");
        item = sc.nextLine();
        System.out.print("Price of the item: ");
        price = sc.nextDouble();
        System.out.print("How much do you want? : ");
        quantity = sc.nextInt();
        total = quantity * price;
    
    
        System.out.println("You have bought " + quantity +" " + item + "/s");
        System.out.println("Your total is :"+ total + currency);
        sc.close();
    }
}
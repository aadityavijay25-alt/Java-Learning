// BANKING PROGRAM
import java.util.Scanner;
public class bankProg {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        double balance = 10;
        int choice;
        boolean isRunning = true;

        while(isRunning){
        System.out.println("BANKING PROGRAM");
        System.out.println("Show Balance");
        System.out.println("Deposit");
        System.out.println("Withdraw");
        System.out.println("Exit");
        
        System.out.println("Enter your Choice :");
        choice = sc.nextInt();

        switch(choice){
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("Invalid Choice!!");
            }
        }
        System.out.println("Thank You Have a Nice Day!");
    }
    static void showBalance(double balance){
        System.out.printf("$%.2f\n",balance);
    }
    static double deposit(){
        double amount;

        System.out.print("Enter a Amount to be deposited: ");
        amount = sc.nextDouble();
        if(amount<0){
            System.out.println("Amount can't be negative!");
            return 0;
        } else {
            return amount;
        }

        
    }

    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = sc.nextDouble();
        if(amount>balance){
            System.out.println("Insufficient Balance!");
            return 0 ;
        } else if(amount<balance) {
            System.out.println("Amount can't be negative!");
            return 0;
        } else {
            return amount;
        }
        
    }
}


import java.util.*;
public class Recursion1 {
    public static void printNum(int n){
        //Base Case jaruri varna stack overflow ho jayega
        if(n==6){
            return;
        }
        //Recursive Case upper se neeche ja raha hai
        System.out.println(n); //print before recursive call
        printNum(n+1); // recursion
    }
    public static void main(String args[]){
        int n=1;
        printNum(n);

    }
   
}
// calclate factorial of a number using recursion
// import java.util.*;

// public class question {    
//     public static int calcFactorial(int n){
//         //Base Case
//         if(n==1 || n==0){
//             return 1;
//         }
//         //Recursive Case

//         int fact_nm1 = calcFactorial(n-1);
//         int fact_n = n* fact_nm1;
//         return fact_n;

//     }
//     public static void main(String args[]){
//     int n  =5; 
//     int ans = calcFactorial(n);
//     System.out.println(ans);

//     }  
// }        

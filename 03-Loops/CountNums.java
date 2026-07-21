public class CountNums {
    public static void main(String[] args) {
        int n= 4595959;
        int num = 5;
        int count = 0;
        int rem=0;
        while(n>0){
            rem = n%10;
            if (rem == num){
                count ++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
    
}

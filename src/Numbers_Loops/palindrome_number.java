package Numbers_Loops;
import java.util.Scanner;
// number is a Palindrome
public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int digit =0;
        int rev = 0;
         for(; n!=0; n=n/10 ){
             digit= n %  10;
             rev= rev * 10 + digit;
         }
        System.out.println("reverse number is "+ rev);

         if( original == rev){
             System.out.println("palindrome number");
         }
         else  {
             System.out.println("no palindrome number");
         }

    }
}

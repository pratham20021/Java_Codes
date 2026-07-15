package Numbers_Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for (; n>0; n=n/10) {
            int digit = n%10;
            sum = digit + sum ;

        }
        System.out.println(sum);
    }
}

package Numbers_Loops;

import java.util.Scanner;

public class Count_EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;
        int even =0;
        int odd=0;
        for (; n!=0; n=n/10) {
            digit = n % 10;
            if (digit % 2 == 0) {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even Digits = " + even);
        System.out.println("Odd Digits = " + odd);

    }
}

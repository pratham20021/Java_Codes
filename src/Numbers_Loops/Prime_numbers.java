package Numbers_Loops;

import java.util.Scanner;

public class Prime_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("Not Prime Number");
        }
        else {
            System.out.println("Prime Number");
        }
    }
}

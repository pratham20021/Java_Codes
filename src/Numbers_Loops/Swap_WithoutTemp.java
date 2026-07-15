package Numbers_Loops;

import java.util.Scanner;

public class Swap_WithoutTemp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();

        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}

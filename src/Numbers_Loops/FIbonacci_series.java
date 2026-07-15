package Numbers_Loops;
import java.util.Scanner;
//Print the first N terms of the Fibonacci series.

public class FIbonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<=n;i++){
            int sum = a+b;
            a=b;
            b=sum;
            System.out.print(a + " ");
        }

    }
}

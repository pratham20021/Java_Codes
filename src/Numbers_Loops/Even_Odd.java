package Numbers_Loops;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Even Numbers");
        for (int i = 1; i <= n; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

        System.out.println("odd Numbers");
        for (int i = 1; i <= n; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
}

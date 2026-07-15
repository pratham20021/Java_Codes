package Numbers_Loops;

//1. Reverse a number. Input: 12345 → Output: 54321

public class Reverse_number {
    public static void main(String[] args) {
        int number = 123456;
        int n1=0, reverse=0;

        for(; number != 0; number/=10) {
            n1 = number%10;
            reverse = reverse*10 + n1;

        }

        System.out.println(reverse);
    }
}

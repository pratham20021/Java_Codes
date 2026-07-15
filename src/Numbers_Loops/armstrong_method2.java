package Numbers_Loops;

import java.util.Scanner;

public class armstrong_method2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the number
        int number = sc.nextInt();

        // Store the original number
        int original = number;

        int count = 0;
        int sum = 0;

        // Count the number of digits
        while (number != 0) {
            count++;
            number = number / 10;
        }

        // Reset number to original
        number = original;

        // Calculate the Armstrong sum
        while (number != 0) {

            int digit = number % 10;

            // Raise the digit to the power of count
            sum += (int) Math.pow(digit, count);

            // Remove the last digit
            number = number / 10;
        }

        // Check if Armstrong
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
package Numbers_Loops;

// Check if a number is an Armstrong Number

import java.util.Scanner;

public class Armstrong_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the number from the user
        int number = sc.nextInt();

        // Store the original number for comparison later
        int original = number;

        int sum = 0;
        int count = 0;

        // Count the number of digits
        for (; number != 0; number = number / 10) {
            count++;
        }

        // Reset number to its original value
        number = original;

        // Extract each digit and calculate digit^count
        for (; number != 0; number = number / 10) {

            // Get the last digit
            int digit = number % 10;

            // Variable to calculate digit raised to the power of count
            int power = 1;

            // Calculate digit^count manually
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            // Add the calculated power to the sum
            sum = sum + power;
        }

        // Check whether the number is Armstrong or not
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
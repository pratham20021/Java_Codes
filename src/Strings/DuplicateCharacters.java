package Strings;

import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Skip spaces
            if (str.charAt(i) == ' ') {
                continue;
            }

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            // Print only first occurrence of duplicate characters
            if (count > 1 && str.indexOf(str.charAt(i)) == i) {
                System.out.print(str.charAt(i) + " ");
            }
        }

        sc.close();
    }
}
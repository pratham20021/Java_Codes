package Arrays;

import java.util.Scanner;

public class MoveAllZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill the remaining positions with 0
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}

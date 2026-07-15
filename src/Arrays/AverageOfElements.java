package Arrays;

import java.util.Scanner;

public class AverageOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum = sum +arr[i];
        }
        int average = sum/n;

        System.out.println("The sum of array is "+sum);
        System.out.println("The average of array is "+average);

    }
}

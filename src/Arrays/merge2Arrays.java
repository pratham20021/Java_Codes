package Arrays;

import java.util.Arrays;

public class merge2Arrays {
    public static void main(String[] args) {

        int arr1[]={1,2,3};
        int arr2[]={4,5,6};

        int[] merged = new int[arr1.length + arr2.length];
        int index = 0;

        // Copy elements of first array
        for (int i = 0; i < arr1.length; i++) {
            merged[index] = arr1[i];
            index++;
        }

        // Copy elements of second array
        for (int i = 0; i < arr2.length; i++) {
            merged[index] = arr2[i];
            index++;
        }

        System.out.println("merged = " + Arrays.toString(merged));
    }
}

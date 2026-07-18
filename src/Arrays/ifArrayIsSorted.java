package Arrays;

import java.util.Scanner;

public class ifArrayIsSorted {
    public static void main(String args[]) {
        int [] arr = {1,3,2,4,5,6};

        boolean isSorted = true;

        for(int i=0;i < arr.length-1; i++) {
                  if(arr[i] > arr[i+1]) {
                      isSorted = false;
                      break;
                  }
        }
        if(isSorted) {
            System.out.println("Sorted array");
        }
        else {
            System.out.println("Not sorted");
        }

    }
}

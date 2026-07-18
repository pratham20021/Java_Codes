//package Arrays;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class FreqUsingHashmap {
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[] = new int[n];
//
//       // input of the array
//        for (int i=0 ; i<arr.length ; i++) {
//            arr[i]=sc.nextInt();
//        }
//
//        Map<Integer,Long> map =  new HashMap<>();
//
//        for (int num : arr) {
//            map.put(num, map.getOrDefault(num, ) + 1);
//        }
//
//        for (Integer key : map.keySet()) {
//            System.out.println(key + " -> " + map.get(key));
//        }
//        sc.close();
//
//    }
//}

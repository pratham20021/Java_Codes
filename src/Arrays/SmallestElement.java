package Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {7,9,6,4,5};
        int min = arr[0] ;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min="+min);
    }
}

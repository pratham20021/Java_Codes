package Numbers_Loops;

import java.util.Scanner;

public class numberofDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
      if(n ==0){
          count =1;
      }
      else{
          n=Math.abs(n);

          while(n>0){
              count++;
              n=n/10;
          }

      }

      System.out.println(count);
  }
}

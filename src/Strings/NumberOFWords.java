package Strings;

import java.util.Scanner;

public class NumberOFWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        int count =0;
        boolean inWord = false;

        for(int i=0; i< str.length();i++){
            char ch = str.charAt(i);

            if( ch != ' '){
                if(!inWord){
                    count++;
                    inWord = true;
                }
            }
            else{
                inWord = false;
            }
        }

        System.out.println("number of words in the string is : "+count);
    }
}

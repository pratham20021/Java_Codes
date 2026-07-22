package Strings;

import java.util.Scanner;

public class LongestWordInSEntence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:-  ");
        String s = sc.nextLine();

        String[] words = s.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("longest word is :-  "+longestWord);
        System.out.println("length of longest word is :- "+longestWord.length() );
    }
}

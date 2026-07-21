package Strings;

import java.util.Scanner;

public class VovelsAndConconentCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='u'||ch=='o'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("vovels = "+ vowels);
        System.out.println("consonants = "+ consonants);
        sc.close();
    }
}

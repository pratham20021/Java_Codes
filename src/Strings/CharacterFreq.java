package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        String str = sc.nextLine();

        Map<Character,Integer> map = new HashMap<>();

        for(char ch: str.toCharArray()){
            if (ch ==' '){
                continue; //ignoring the spaces
            }

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //printing
        System.out.println("Frequenct of Characters");

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}

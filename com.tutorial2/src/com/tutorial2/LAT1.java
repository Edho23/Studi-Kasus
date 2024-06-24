package com.tutorial2;

import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LAT1 {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String Kata;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        Kata = inputUser.nextLine();
        
        for(char c : Kata.toCharArray()){
            if(c != ' '){
            map.merge(c,1, Integer::sum);
            }
        }
        Map.Entry<Character, Integer> entry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
        System.out.println("Huruf yang sering muncul : " + entry.getKey() + entry.getValue());
    }
    
}

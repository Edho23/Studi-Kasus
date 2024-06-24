package com.tutorial2;

import java.util.*;

public class LAT2 {
    public static void main(String[] args){
        String Line;
        Scanner inputUser =  new Scanner(System.in);
        
        System.out.print("Masukkan Kode : ");
        Line = inputUser.nextLine();
        int index = 0;
        while(index < Line.length() && Character.isLetter(Line.charAt(index))){
            index++;
        }
        String Baris1 =  Line.substring(0,index);
        String Baris2 = Line.substring(index);
        
        System.out.println("Kata yang di input : " + Baris1);
        System.out.println("Kode yang di input : " + Baris2);
    }
}

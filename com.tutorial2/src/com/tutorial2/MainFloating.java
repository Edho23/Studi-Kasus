package com.tutorial2;

import java.util.*;

public class MainFloating {

    public static void main(String[] args) {
        Floating floating = new Floating();
        Scanner userInput =  new Scanner(System.in);
        
        
        System.out.println("==========================");
        System.out.println("--------BILANGAN BULAT--------");
        
        System.out.print("Masukkan Nilai A = ");
        int intA = userInput.nextInt();
        
        System.out.print("Masukkan Nilai B = ");
        int intB = userInput.nextInt();
        
        System.out.println("--------BILANGAN PECAHAN--------");
        System.out.print("Masukkan Nilai A = ");
        double doubleA = userInput.nextDouble();
        
        System.out.print("Masukkan Nilai B = ");
        double doubleB = userInput.nextDouble();
        
        int hasilBulat = floating.bilangan(intA,intB);
        double hasilpecahan = floating.bilangan(doubleA, doubleB);
        System.out.println("--------HASIL DARI BILANGAN BULAT DAN PECAHAN--------");
        System.out.println("HASIL DARI PENJUMLAHAN = " + hasilBulat);
        System.out.println("HASIL DARI PENJUMLAHAN = " + hasilpecahan);
    }
    
}

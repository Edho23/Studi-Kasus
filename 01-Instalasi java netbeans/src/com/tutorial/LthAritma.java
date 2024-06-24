package com.tutorial;

import java.util.Scanner;

public class LthAritma {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int panjang,lebar,luas;
        
        // Membuat perhitungan luas persegi panjang
        
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();
        
        luas = panjang * lebar;
        
        System.out.println("luas = " + luas);
    }
    
}

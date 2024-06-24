package com.tutorial;

import java.util.Scanner;

public class Tes {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int a = 5; 
        int b = 10;
        
        System.out.print("Masukkan nilai a = ");
        a = userInput.nextInt();
        
        System.out.print("Masukkan nilai b = ");
        b = userInput.nextInt();
        
        if (a == 5){
            
            if (b == 10){
                
                System.out.println("ini adalah aksi dimana a = 5 dan b = 10");
                
            } else {
                
                System.out.println("Ini adalah nilai a = 5 bukan b = 10");
                
            }
        } else {
            
            System.out.println("Ini adalah default bukan a dan b");
        }
        
    }
    
}

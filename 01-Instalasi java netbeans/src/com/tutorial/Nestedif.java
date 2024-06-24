package com.tutorial;

import java.util.Scanner;

public class Nestedif {

    public static void main(String[] args) {
        Scanner userInput  = new Scanner(System.in);
        // nested If / if bersarang
        int a = 5;
        int b = 10;
        
        System.out.print("Masukkan Nilai =");
        a = userInput.nextInt();
        
        if (a == 5){
            
            if(b == 10){
                
                System.out.println("ini adlah aksi, dimana a = 5 dan b = 10");
                
            } else {
                
                System.out.println("ini adalah dimana a = 5 dan b bukan 10");
                
            } 
        } else {
            
            System.out.println("ini adalah default, dimana a salah");
            
        }
        System.out.println("ini adalah AKhir program");
    }
    
}

package com.tutorial;

import java.util.Random;
        
public class Tugas {

    public static void main(String[] args) {
        Random Data1 = new Random();
        int Bul;
        int I = 0;
        while(I<=20){
        Bul=Data1.nextInt(500);
        if(Bul > 0){
        System.out.println(Bul);
        I++;
          }
        }
    }
    
}

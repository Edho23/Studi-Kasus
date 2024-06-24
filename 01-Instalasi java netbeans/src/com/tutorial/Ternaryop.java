package com.tutorial;

import java.util.*;

public class Ternaryop {

public static void main(String[] args){
    
    int input, x;
    Scanner userInput = new Scanner(System.in);
    
    System.out.print("Masukkan Nilai : ");
    input = userInput.nextInt();
    // jika menggunakan ternary operator
    // variabele x = ekspersi ? statement_true : statement_false;
    
    x = (input == 10)? (input*input) : (input/2);
    
    // jika menggunakan if
//    if(input == 10){
//        x = input*input;
//    } else{
//        x = input/2;
//    }
    System.out.println("Hasil : " + x);
    
  }    
}

package com.tutorial;
import java.util.*;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner inputUser;
        float a,b,hasil;
        char operator;
        
        inputUser = new Scanner(System.in);
        
        System.out.print("Nilai A = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("Nilai B = ");
        b = inputUser.nextFloat();
        
        System.out.println("Input user : " + a + " " + operator + " " + b);
        
        if(operator == '+'){
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        }else if(operator == '-'){
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        }else if(operator == '*'){
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        }else if(operator == '/'){
            if(b == 0){
              System.out.println("Hasil pembagian nol tak terhingga");
            }else {
            hasil = a / b;
            System.out.println("Hasil = " + hasil);   
            }
        }
    }
    
}

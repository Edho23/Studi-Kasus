package com.tutorial;

import java.util.*;

public class Programlog {

    public static void main(String[] args) {
        
        // membuat objek untuk menangkap input user
        
        Scanner inputUser = new Scanner(System.in);
        
        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
        
        System.out.print("Masukkan nila tebkan anda = ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai Tebakan anda adalah : " + nilaiTebakan);
        
        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebkana anda : " + statusTebakan);
        
        // operasi aljabar boolean (and / or)
        
        System.out.println("Mauskkan nilai diantara 4 dan 9 ");
        nilaiTebakan = inputUser.nextInt();
        
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        
        System.out.println("Tebakan anda : " + statusTebakan);
    }
    
}

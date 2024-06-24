package com.tutorial;

import java.util.*;

public class Pertambahan {
    public static void main(String[] args){
        int nilaiAwal, nilaiAkhir, total;
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Awal : ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukkan Nilai Akhir : ");
        nilaiAkhir = inputUser.nextInt();
        
        total = 0;
        
//        do{
//            total = total + nilaiAwal;
//            System.out.println("Ditambah " + nilaiAwal + " Menjadi " + total);
//            nilaiAwal++;
//        }while(nilaiAwal <= nilaiAkhir);
        for(;1
                nilaiAwal <= nilaiAkhir; nilaiAwal++){
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " Menjadi " + total);
        }
    }
}

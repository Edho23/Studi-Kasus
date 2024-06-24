package com.tutorial2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Bustayo bustayo = new Bustayo();
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("Masukkan Penumpang = ");
        bustayo.jumlahPenumpang = inputUser.nextInt();
        
        System.out.print("Masukkan Jarak Tempuh = ");
        bustayo.jarakTempuh = inputUser.nextDouble();
        
        System.out.println("==========Output==========");
                
        System.out.println("Jumlah Penumpang = " + bustayo.jumlahPenumpang);
        System.out.println("Total Bus Dibutuhkan = " + bustayo.hitungjumlahTayo() + " BusTayo");
        System.out.println("Berat Bus + Keseluruhan Penumpang = " + bustayo.hitungBeratKeseluruhan() + " Kg");
        
        System.out.println("=========================================");
        
        System.out.println("Jarak Tempuh = " + bustayo.jarakTempuh + " Km");
        System.out.println("Berat Bus = " + bustayo.beratBus + " Kg");
        System.out.println("Konsumsi Bahan Bakar = " + bustayo.konsumsiBahanBakar + " Liter/Km");
        System.out.println("Total bahan bakar yang dibutuhkan = " + bustayo.hitungTotalBahanBakar() + " Liter");
    }
    
}

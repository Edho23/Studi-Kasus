package com.tutorial2;

import java.util.*;

public class Mahasiswa {

   
    public static void main(String[] args) {
        Function fun = new Function();
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan Nama = ");
        fun.nama = userInput.nextLine();
        
        System.out.print("Masukkan Kelas = ");
        fun.kelas = userInput.nextLine();
        
        System.out.print("Masukkan Nbi = ");
        fun.Nbi = userInput.nextInt();
        userInput.nextLine();
        
        System.out.print("Matakuliah = ");
        fun.Matkul = userInput.nextLine();
        
        System.out.print("Masukkan Kehadiran = ");
        fun.Hadir = userInput.nextInt();
        
        System.out.print("Masukkan Uts = ");
        fun.nilaiUts = userInput.nextDouble();
        
        System.out.print("Masukkan Tugas = ");
        fun.nilaiTugas = userInput.nextDouble();
        
        System.out.print("Masukkan Uas = ");
        fun.nilaiUas = userInput.nextDouble();
        
        userInput.nextLine();
        System.out.println();
        
        fun.totalNilai = fun.hitungTotalnilai();
        fun.Predikat = fun.tentukanPredikat();
        fun.status = fun.showStatus();
        
        fun.tampilkan();
    }
    
}

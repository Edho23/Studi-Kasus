package Dospem;

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
        
        System.out.print("Masukkan Matakuliah = ");
        fun.Matkul = userInput.nextLine();
        
        System.out.print("Masukkan Kehadiran = ");
        fun.Hadir = userInput.nextDouble();
        
        System.out.print("Masukkan Nilai Uts = ");
        fun.nilaiUts = userInput.nextDouble();
        
        System.out.print("Masukkan Nilai Tugas = ");
        fun.Tugas = userInput.nextDouble();
        
        System.out.print("Masukkan Nilai Uas = ");
        fun.nilaiUas = userInput.nextDouble();
        
        fun.totalNilai = fun.hitungTotalnilai();
        fun.Predikat = fun.TentukanPredikat();
        fun.status = fun.showStatus();
        
        fun.tampilkan();
        
    }
    
}

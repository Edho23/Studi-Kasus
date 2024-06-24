package com.tutorial2;

import java.util.*;

class KaryawanTetap extends Karyawan{
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Sesi Pratikum = sesi 1");
    }
}

public class Gaji {

    public static void main(String[] args) {
        Karyawan karyawanTetap = new Karyawan();
        Karyawan karyawanKontrak = new Karyawan();
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("Masukkan Nama = ");
        karyawanTetap.Nama = inputUser.nextLine();
        
        System.out.print("Masukkan NBI = ");
        karyawanTetap.NBI = inputUser.nextLine();
        
        System.out.print("Masukkan Tunjangan = ");
        karyawanTetap.Tunjangan = inputUser.nextDouble();
        
        inputUser.nextLine();
        
        karyawanTetap.tampilkanInfo();
        
        System.out.println("Total Gaji Karyawan = " + karyawanTetap.hitungGaji() + "\n");
        
        System.out.print("Masukkan Nama = ");
        karyawanKontrak.Nama = inputUser.nextLine();
        
        System.out.print("Masukkan NBI = ");
        karyawanKontrak.NBI = inputUser.nextLine();
        
        System.out.print("Masukkan Harikerja = ");
        karyawanKontrak.Harikerja = inputUser.nextInt();
        
        karyawanKontrak.tampilkanInfo();
        
        System.out.println("Total Gaji Karyawan = " + karyawanKontrak.hitungGaji() + "\n");
        
    }
    
}

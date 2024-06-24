package com.tutorial2;


class Karyawan {
    String Nama;
    String NBI;
    
    double Gajipokok = 1000000;
    double Tunjangan;
    double Gajipokok2 = 900000;
    double Gajiperhari = 150000;
    int Harikerja;
    
    public double hitungGaji(){
        double totalGajiTetap = Gajipokok + Tunjangan;
        return totalGajiTetap;
    }
    public double hitungGaji(int Harikerja){
        double totalGajiKontrak = Gajipokok2 + (Harikerja * Gajiperhari);
        return totalGajiKontrak;
    }
    
    
    public void tampilkanInfo(){
        System.out.println("Nama = " + Nama);
        System.out.println("NBI = " + NBI);
    }
}

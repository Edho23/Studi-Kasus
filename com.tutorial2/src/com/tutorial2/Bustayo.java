package com.tutorial2;

public class Bustayo {
    int jumlahPenumpang;
    double jarakTempuh;
    double konsumsiBahanBakar = 22.29;
    double beratBus = 5200;
    double beratPenumpang = 50.5;
    int kapasitasMax = 40;
    
    public double hitungBeratKeseluruhan(){
        double totalBeratPenumpang = jumlahPenumpang * beratPenumpang;
        double totalBeratKeseluruhan = beratBus + totalBeratPenumpang;
        return totalBeratKeseluruhan;
    }
    
    public double hitungTotalBahanBakar(){
        double totalBahanBakar = jarakTempuh * konsumsiBahanBakar;
        return totalBahanBakar;
    }
    
    public int hitungjumlahTayo(){
        int totalBus = jumlahPenumpang / kapasitasMax;
        if(jumlahPenumpang % kapasitasMax != 0){
            totalBus++;
        }
        return totalBus;
    }
}

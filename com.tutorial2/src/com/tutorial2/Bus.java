package com.tutorial2;

public class Bus {
    int jumlahPenumpang;
    double jarakTempuh;
    double konsumsiBahanBakar = 21.25;
    double beratBus;
    double beratPenumpang = 50.5;
    
    public double hitungBeratKeseluruhan(){
        double totalBeratPenumpang = jumlahPenumpang * beratPenumpang;
        double totalBeratKeseluruhan = beratBus + totalBeratPenumpang;
        return totalBeratKeseluruhan;
    }
    
    public double hitungTotalBahanBakar(){
        double totalBahanBakar = jarakTempuh * konsumsiBahanBakar;
        return totalBahanBakar;
    }
    
    public int totalBus()
    {
        int busTotal = jumlahPenumpang % 40;
        if (jumlahPenumpang % 40 != 0)
        {
            busTotal++;
        }
        return busTotal;
    }
}


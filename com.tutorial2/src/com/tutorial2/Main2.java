package com.tutorial2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[]Args)
    {
        Bus bus = new Bus();
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========================");
        System.out.println("--------Input Data--------");
        System.out.print("Input banyak penumpang : ");
        bus.jumlahPenumpang = input.nextInt();
        input.nextLine();
        
        System.out.print("Input jarak tempuh : ");
        bus.jarakTempuh = input.nextDouble();
        input.hasNextLine();
        
        System.out.print("Input berat bus : ");
        bus.beratBus = input.nextInt();
        input.nextLine();
        
        System.out.println("");
        
        System.out.println("--------Outut Data--------");
        System.out.println("Jumlah penumpang: " + bus.jumlahPenumpang);
        System.out.println("Total Bus yang dibutuhkan: " + bus.totalBus());
        System.out.println("Berat Bus + keseluruhan penumpang: " + bus.hitungBeratKeseluruhan() + " kg");
        System.out.println("===============================================");
        System.out.println("Jarak tempuh: " + bus.jarakTempuh + " km");
        System.out.println("Berat bus: " + bus.beratBus + " kg");
        System.out.println("Konsumsi Bahan Bakar: " + bus.konsumsiBahanBakar + " liter/km");
        System.out.println("Total bahan bakar yang dibutuhkan: " + bus.hitungTotalBahanBakar() + " liter");
        
        bus.hitungBeratKeseluruhan();
        bus.hitungTotalBahanBakar();
        bus.totalBus();
    }
}


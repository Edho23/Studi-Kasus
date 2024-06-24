package com.tutorial2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Date;

public class Import {

    public static void main(String[] args) throws IOException {
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("Masukkan Nama:");
        String isiFile = inputUser.nextLine();
        
        System.out.print("Masukkan NBI:");
        String isiFile2 = inputUser.nextLine();
        
        String isiFile3 = "Saya Sedang mengerjakan Tugas modul Pratikum PBOF pertemuan 2";
        String isiFile4 = "File ini dibuat pada Tanggal : ";
        Date currentDate = new Date();
        
        try (FileWriter fw = new FileWriter("Outfile.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {
            
            bw.write(isiFile3 + "\n");
            bw.write(isiFile4 + "\n");
            bw.write("NAMA = " + isiFile + "\n");
            bw.write("NBI = " + isiFile2 + "\n");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println(isiFile3);
        System.out.println(isiFile4 + currentDate.toString());
        System.out.println("NAMA = " + isiFile);
        System.out.println("NBI = " + isiFile2);
    }
}

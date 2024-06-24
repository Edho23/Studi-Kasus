/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dospem;

import java.util.StringTokenizer;

class Fruit {
     String Nama;
     String Deskripsi;
     int jumlah;
     int Harga;
     int Total;

    public int TotalHarga(){
        return Harga * jumlah;
    }
    public void Deskripsi(){
        StringTokenizer tokenizer = new StringTokenizer(Deskripsi);
        System.out.println("Banyak Token Deskripsi = " + tokenizer.countTokens());
        while(tokenizer.hasMoreTokens()){
            System.out.print(tokenizer.nextToken() + "|");
        }
        System.out.println();
    }
    
    public void display(){
        System.out.println("========OUTPUT========");
        System.out.println("Nama Buah = " + Nama);
        System.out.println("Deskripsi Buah = " + Deskripsi);
        System.out.println("Jumlah Buah = " + jumlah);
        System.out.println("Harga Buah = " + Harga);
        System.out.println("Harga Keseluruhan = " + TotalHarga() );
        System.out.println("===================================");
    }
            
    
}

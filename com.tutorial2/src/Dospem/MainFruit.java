/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dospem;

import java.util.*;

public class MainFruit {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("========INPUT========");
        System.out.print("Masukkan Nama Buah = " );
        fruit.Nama = userInput.nextLine();
        
        System.out.print("Masukan Deskripsi " + fruit.Nama + " = ");
        fruit.Deskripsi = userInput.nextLine();
        
        System.out.print("Jumlah Buah " + fruit.Nama + " = ");
        fruit.jumlah = userInput.nextInt();
        userInput.nextLine();
        
        System.out.print("Harga Buah " + fruit.Nama + " = ");
        fruit.Harga = userInput.nextInt();
        userInput.nextLine();
        
        fruit.display();
        fruit.Deskripsi();
        System.out.println(" ");
    }
    
}

package com.tutorial;

public class Konversi {

    public static void main(String[] args) {
        // program untuk konversi data
        int nilaiInt = 450; // 32-bit
        System.out.println("Nilai int = " + nilaiInt);
        
        //memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);
        
        // Memperkecil rentang ke tipe data yang lebih kecil 
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);
        
        //  casting pembagian
        // meski pun int bagi float atau sebaliknya Hasilnya tetap float.
        float a = 10;
        int b = 4;
        
        float c = a/b;
        System .out.printf(" %f / %d = %f\n",a,b,c);
        
        // jika ingin tetap memakai int tapi ingin hasil float 
        int x = 10;
        int y = 4;
        
        float z = (float) x/y;
        System .out.printf(" %d / %d = %f\n",x,y,z);
        
        
        
    }
    
}

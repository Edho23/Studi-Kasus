package com.tutorial;
public class Penjumlahan {
    public static void main(String[] args) {
       int variabel1 = 11;
       int variabel2 = 5;
       
       int hasil;
       
       //1.penjumlahan
       hasil = variabel1 + variabel2;
       
       System.out.println(hasil);
       
       //2.pengurangan 
       hasil = variabel1 - variabel2;
       
       System.out.printf("%d - %d = %d \n",variabel1,variabel2,hasil);
       
       //3.perkalian
       hasil = variabel1 * variabel2;
       
       System.out.printf("%d X %d = %d \n",variabel1,variabel2,hasil);
       
       //4.Pembagian
       hasil = variabel1 / variabel2;
       
       System.out.printf("%d / %d = %d \n",variabel1,variabel2,hasil);
       
       float a = 6;
       float b = 5;
       float hasilFloat = a/b;
       System.out.println(a + " / " + b + " = " + hasilFloat);
       
       //5.Modulus(Sisa pembagian)
       hasil = variabel1 % variabel2;
       
       System.out.printf("%d %% %d = %d \n",variabel1,variabel2,hasil);
    }
    
}

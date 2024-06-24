package com.tutorial2;

class Mahasiswa{
    String nama;
    String jurusan;
    String nbi;
    
    Mahasiswa(String inputNama, String inputJurusan, String inputNbi){
        nama = inputNama;
        jurusan = inputJurusan;
        nbi = inputNbi;
        
        System.out.println(nama);
        System.out.println(jurusan);
        System.out.println(nbi);
    }
}
    
public class Manusia{
    public static void main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup","informatika", "1462300061");
    }
}  
package com.tutorial2;


public class Function {
    String nama;
    String kelas;
    String Matkul;
    String status;
    String Predikat;
    int Nbi;
    double Hadir;
    double nilaiUts;
    double nilaiTugas;
    double nilaiUas;
    double totalNilai;
    
    public Function() {
    }
    
    public Function(String nama, int Nbi, String kelas, double Hadir, double nilaiUts, double nilaiTugas, double nilaiUas){
        this.nama = nama;
        this.Nbi = Nbi;
        this.kelas = kelas;
        this.Matkul = Matkul;
        this.Hadir = Hadir;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUas = nilaiUas;
        this.nilaiUts = nilaiUts;
        this.totalNilai = hitungTotalnilai();
        this.Predikat = tentukanPredikat();
        this.status = showStatus();
    }
    
    public double hitungTotalnilai(){
        return (Hadir * 0.10) + (nilaiTugas * 0.20) + (nilaiUts * 0.30) + (nilaiUas * 0.40);
    }
    
    public String tentukanPredikat(){
        if(totalNilai >= 90 && totalNilai <= 100){
            return "A";
        }else if(totalNilai >= 80 && totalNilai <= 90){
            return "B++";
        }else if(totalNilai >= 70 && totalNilai <= 80){
            return "B";
        }else if(totalNilai >=50 && totalNilai <= 70){
            return "C";
        }else{
            return "D";
        }
    }
    
    public String showStatus(){
        return totalNilai >= 65 ? "lulus" : "Tidak Lulus";
    }
    
    public void tampilkan(){
        System.out.println("=====DATA MAHASISWA======");
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("Kelas Mahasiswa = " + kelas);
        System.out.println("Nbi Mahasiswa = " + Nbi);
        System.out.println("Matakuliah Mahasiswa = " + Matkul);
        System.out.println("Hasil Mahasiswa = " + totalNilai);
        System.out.println("Predikat = " + Predikat);
        System.out.println("Status = " + status);
    }
    
}

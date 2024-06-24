package Dospem;

public class Function {
    String nama;
    String kelas;
    String Matkul;
    String status;
    String Predikat;
    int Nbi;
    double Hadir;
    double Tugas;
    double nilaiUts;
    double nilaiUas;
    double totalNilai;
    
    public Function(){  
    }
    
    public Function(String nama, String Matkul, String kelas, int Nbi, double hadir,double Tugas, double nilaiUts, double nlaiUas){
        this.nama = nama;
        this.kelas = kelas;
        this.Matkul = Matkul;
        this.Nbi = Nbi;
        this.Hadir = Hadir;
        this.Tugas = Tugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        this.totalNilai = hitungTotalnilai();
        this.Predikat = TentukanPredikat();
        this.status = showStatus();
        
    }
    
    public double hitungTotalnilai(){
            return (Hadir * 0.10) + (Tugas * 0.20) + (nilaiUts * 0.30) + (nilaiUas * 0.40);
        }
    public String TentukanPredikat(){
        if(totalNilai >= 90 && totalNilai <= 100){
            return "A";
        }else if(totalNilai >= 80 && totalNilai <= 90){
            return "B++";
        }else if(totalNilai >= 70 && totalNilai <= 80){
            return "B";
        }else if(totalNilai >= 50 && totalNilai <= 70){
            return "C";
        }else {
            return "D";
        }
    } 
    
    public String showStatus(){
        return totalNilai >= 70 ? "Lulus" : "Tidak Lulus";
    }
    
    public void tampilkan(){
        System.out.println();
        System.out.println("======DATA MAHASISWA======");
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("Kelas Mahasiswa = " + kelas);
        System.out.println("Nbi Mahasiswa = " + Nbi);
        System.out.println("Matakuliah Mahasiswa = " + Matkul);
        System.out.println("Hasil Mahasiswa = "  + totalNilai);
        System.out.println("Predikat Mahasiswa = " + Predikat);
        System.out.println("Status Mahasiswa = " + status);
    }
}

package Dospem;

class Barang{
    protected double Harga;
    protected double Berat;
    
    public Barang(double Harga, double Berat){
        this.Harga = Harga;
        this.Berat = Berat;
    }
    
    public double KalkulasiHarga(){
        return Harga * Berat;
    }
}

class Emas extends Barang{
    public Emas(double Berat){
        super(500000, Berat);
    }
}

class Berlian extends Barang{
    public Berlian(double Berat){
        super(1000000,Berat);
    }
    
}

public class Perhiasan {

    public static void main(String[] args) {
        Emas emas = new Emas(4);
        Berlian berlian = new Berlian(2);
        
        double KalungEmas = emas.KalkulasiHarga();
        double CincinBerlian = berlian.KalkulasiHarga();
        double TotalHarga = KalungEmas + CincinBerlian;
        
        System.out.println("Harga Emas = 500.000/Gram" );
        System.out.println("Harga Berlian = 1.000.000/Gram");
        System.out.println("Harga Kalung Emas 4Gr = " + KalungEmas);
        System.out.println("Harga Cincin Berlian 2Gr = " + CincinBerlian);
        System.out.println("Jumlah Total Harga = " + TotalHarga);
        
        
    }
    
}

package Dospem;

public class Cat implements InterfaceHewan {
    
    @Override
    public void Suara(){
        System.out.println("MEONG-MEONG");
    }
    
    @Override
    public void perilaku(){
        System.out.println("Kucing sedang Berjalan diTaman");
    }
}

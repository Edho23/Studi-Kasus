package Dospem;

public class Dog implements InterfaceHewan {
    
    @Override
    public void Suara(){
        System.out.println("GUK-GUK");
    }
    
    @Override
    public void perilaku(){
        System.out.println("Anjing sedang berjalan diTaman");
    }
    
}

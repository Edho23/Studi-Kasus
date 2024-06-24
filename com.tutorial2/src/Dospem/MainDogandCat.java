package Dospem;

public class MainDogandCat {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.println("Kucing = ");
        cat.Suara();
        cat.perilaku();
        
        System.out.println("\n");
      
        System.out.println("Anjing = ");
        dog.Suara();
        dog.perilaku();
    }
    
}

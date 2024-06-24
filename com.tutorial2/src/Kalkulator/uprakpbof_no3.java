import java.util.Scanner;

/**
 *
 * @author user
 */
class Perhiasan {
    protected double pricePerGram;
    protected double weight;

    public Perhiasan(double pricePerGram, double weight) {
        this.pricePerGram = pricePerGram;
        this.weight = weight;
    }

    public double calculatePrice() {
        return pricePerGram * weight;
    }
}
class Gold extends Perhiasan {
    public Gold(double weight) {
        super(500000, weight);
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice();
    }
}
class Diamond extends Perhiasan {
    public Diamond(double weight) {
        super(1000000, weight);
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice();
    }
}
public class uprakpbof_no3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Gold goldNecklace = new Gold(4); // 4 gram
        Diamond diamondRing = new Diamond(2); // 2 gram
        
        
        
        double goldNecklacePrice = goldNecklace.calculatePrice();
        double diamondRingPrice = diamondRing.calculatePrice();
        double totalPrice = goldNecklacePrice + diamondRingPrice;

        System.out.println("Harga Emas = 500000/gram");
        System.out.println("Harga Berlian = 1000000/gram");
        System.out.println("Harga Kalung Emas 4gr = " + goldNecklacePrice);
        System.out.println("Harga Cincin Berlian 2gr = " + diamondRingPrice);
        System.out.println("Jumlah Total Harga = " + totalPrice);
    }
}
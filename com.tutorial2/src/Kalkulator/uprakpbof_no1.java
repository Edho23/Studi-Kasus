package prak_dospem;
import java.util.Scanner;
import java.util.StringTokenizer;

class Fruit {
    private String name;
    private String description;
    private int quantity;
    private int pricePerUnit;

    public Fruit(String name, String description, int quantity, int pricePerUnit) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
    
    public void displayInfo() {
        int totalPrice = quantity * pricePerUnit;
        System.out.println(" ");
        System.out.println("+++Hasil Output+++");
        System.out.println("Nama Buah : " + name);
        System.out.println("Deskripsi Buah : " + description);
        System.out.println("Jumlah Buah : " + quantity);
        System.out.println("Harga Buah : Rp." + pricePerUnit);
        System.out.println("Harga Keseluruhan Buah : " + totalPrice);
        System.out.println("++++++++++++++++++++++");
    }
    public void tokenizeDescription() {
        StringTokenizer tokenizer = new StringTokenizer(description);
        System.out.println("Banyak Token Deskripsi Buah : " + tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()) {
            System.out.print(tokenizer.nextToken() + "|");
        }
        System.out.println();
    }
    
}

public class uprakpbof_no1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++Masukkan deskripsi Buah+++");
        System.out.print("Masukan nama buah : ");
        String name = scanner.nextLine();

        System.out.print("Masukan deskripsi buah " + name + " : ");
        String description = scanner.nextLine();

        System.out.print("Jumlah buah " + name + " : ");
        int quantity = scanner.nextInt();

        System.out.print("Harga buah " + name + " : ");
        int pricePerUnit = scanner.nextInt();

        Fruit fruit = new Fruit(name, description, quantity, pricePerUnit);
        fruit.displayInfo();
        fruit.tokenizeDescription();
        System.out.println(" ");
    }
    
}
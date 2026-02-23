import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque as informações do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.println("Coloque o numero de produtos para serem adicionados no estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Informações atualizadas: " + product);

        System.out.println();
        System.out.println("Coloque o numero de produtos para serem removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Informações atualizadas: " + product);

        sc.close();
    }
}
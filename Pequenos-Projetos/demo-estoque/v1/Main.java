import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Coloque as informações do produto: ");
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.println("Coloque o numero de produtos para serem adicionados no estoque: ");
        int quantidade = sc.nextInt();
        product.addProducts(quantidade);

        System.out.println();
        System.out.println("Informações atualizadas: " + product);

        System.out.println();
        System.out.println("Coloque o numero de produtos para serem removidos do estoque: ");
        quantidade = sc.nextInt();
        product.removeProducts(quantidade);

        System.out.println();
        System.out.println("Informações atualizadas: " + product);

        sc.close();
    }
}
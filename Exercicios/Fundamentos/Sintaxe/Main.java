import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /* if (a > b && a > c) {
            System.out.println("Maior = " + a);
        }

        else if (b > a && b > c) {
            System.out.println("Maior = " + b);
        }

        else {
            System.out.println("Maior = " + c);
        } */

        int maior = max(a, b, c);

        print(maior);

        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        }

        else if (y > x && y > z) {
            aux = y;
        }

        else {
            aux = z;
        }
        return aux;
    }

    public static void print(int valor) {
        System.out.println("Maior = " + valor);
    }
}
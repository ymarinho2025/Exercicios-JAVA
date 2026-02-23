import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------- SOMAR NUMEROS --------------------\n");

        System.out.print("Quantos numeros quer colocar? ");
        int N = sc.nextInt();

        int soma = 0;
        for (int i=0; i<N; i++) {
            System.out.print("Digite o numero: ");
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        sc.close();
    }
}
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("----------- Calcular média -----------\n");
        System.out.print("Quantas notas você possui para essa matéria? ");
        int N = sc.nextInt();

        double soma = 0.0;

        for (int i = 0; i < N; i++) {

            System.out.print("Digite sua nota: ");
            int x = sc.nextInt();

            if (x > 10) {
                System.out.println("A nota não pode ser maior que 10. Digite novamente.");
                i--; // voltar posição loop
                continue;
            }

            soma = soma + x;

        }
        double media = soma / N;
        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }
}



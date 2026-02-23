import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("--------------- CALCULADORA ---------------\n");

        System.out.print("Digite o número 1: ");
        double numero1 = sc.nextDouble();
        sc.nextLine();

        String op;
        while (true) {
            System.out.print("Escolha a operação: (+) (-) (*) (/)\n> ");
            // use next() para ler só um token (evita pular)
            op = sc.next();
            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                break;
            }
            System.out.println("Operação inválida. Tente novamente.");
        }

        System.out.print("Digite o número 2: ");
        double numero2 = sc.nextDouble();

        double resultado;

        switch (op) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2 == 0) {
                    System.out.println("Erro: divisão por zero!");
                    sc.close();
                    return;
                }
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operação inválida!");
                sc.close();
                return;
        }

        System.out.println("\nResultado: " + resultado);
        sc.close();
    }
}

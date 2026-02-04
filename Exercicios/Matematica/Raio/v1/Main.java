import java.util.Scanner;
import java.util.Locale;
import util.Calculator;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();

        double c = calc.circunferencia(raio);

        double v = calc.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", calc.PI);

        sc.close();
    }
}
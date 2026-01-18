import java.util.Scanner;
import java.util.Locale;

import entities.Account;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque as informações da conta: ");
        System.out.print("Numero da conta: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Fazer deposito inicial (y/n)? ");
        String deposit = sc.nextLine();

        Account account;

        if (deposit.equalsIgnoreCase ("y")) {
            System.out.println("Digite o valor do deposito inicial: ");
            double initialValue = sc.nextDouble();
            account = new Account(number, name, initialValue);

        }

        else if (deposit.equalsIgnoreCase("n")) {
            account = new Account(number, name);
        }

        else {
            System.out.println("Aceitamos apenas (y) ou (n) como resposta!");
            sc.close();
            return;
        }

        System.out.println();
        System.out.println(account);

        System.out.println();
        System.out.println("Coloque o valor do deposito: ");
        double dep = sc.nextDouble();
        account.addValue(dep);

        System.out.println();
        System.out.println("Informações atualizadas: " + account);

        System.out.println();
        System.out.println("Coloque o valor do saque: ");
        dep = sc.nextDouble();
        account.removeValue(dep);

        System.out.println();
        System.out.println("Informações atualizadas: " + account);

        sc.close();
    }
}
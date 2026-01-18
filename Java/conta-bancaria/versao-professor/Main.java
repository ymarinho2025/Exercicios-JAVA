import java.util.Scanner;
import java.util.Locale;

import entities.Account;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Coloque as informações da conta: ");
        System.out.print("Numero da conta: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Nome: ");
        String holder = sc.nextLine();

        System.out.print("Fazer deposito inicial (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.println("Digite o valor do deposito inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);

        }
        else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Informações da conta:");
        System.out.println(account);

        System.out.println();
        System.out.println("Coloque o valor do deposito: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println();
        System.out.println("Informações atualizadas:");
        System.out.println(account);

        System.out.println();
        System.out.println("Coloque o valor do saque: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println();
        System.out.println("Informações atualizadas:");
        System.out.println(account);

        sc.close();
    }
}
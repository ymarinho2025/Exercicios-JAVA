import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 150.0, 500.0);

        Account acc01 = bacc;
        System.out.println("Acc01: " + acc01.getBalance());

        Account acc10 = new Account(1001, "Alex", 1000.0);
        acc10.withdraw(200.0);
        System.out.println("Acc10: " + acc10.getBalance());

        Account acc20 = new SavingsAccount(1002, "Maria", 1000.0, 0.1);
        acc20.withdraw(200.0);
        System.out.println("Acc20: " + acc20.getBalance());

        Account acc30 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc30.withdraw(200.0);
        System.out.println("Acc30: " + acc30.getBalance());

        // UPCASTING

        Account acc02 = new BusinessAccount(1003, "Bob", 2.0, 200.0);
        System.out.println("Acc02: " + acc02.getBalance());

        Account acc03 = new SavingsAccount(1003, "Ana", 3.0, 0.1);
        System.out.println("Acc03: " + acc03.getBalance());

        // DOWNCASTING

        BusinessAccount acc04 = (BusinessAccount)acc02;
        acc04.loan(100.0);
        System.out.println("Acc04: " + acc04.getBalance());

        // BusinessAccount acc05 = (BusinessAccount)acc3;
        if (acc03 instanceof BusinessAccount) {
            BusinessAccount acc05 = (BusinessAccount)acc03;
            acc05.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc03 instanceof SavingsAccount) {
            SavingsAccount acc05 = (SavingsAccount)acc03;
            acc05.updateBalance();
            System.out.println("Update!");
        }
    }
}
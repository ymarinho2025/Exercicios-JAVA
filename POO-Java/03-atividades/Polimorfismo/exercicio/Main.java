import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.println("Coloque o numero de funcionarios: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.println("Funcionario #" + i + " data:");
            System.out.println("Terceirizado (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Horas: ");
            int hours = sc.nextInt();
            System.out.println("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            if ( ch == 'y' ) {
                System.out.println("Taxa adicional: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            }
            else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("Pagamentos:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
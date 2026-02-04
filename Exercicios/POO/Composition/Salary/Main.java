import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws ParseException {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Coloque o nome do departamento: ");
    String departmentName = sc.nextLine();
    System.out.println("Coloque as informações do trabalhador: ");
    System.out.print("Nome: ");
    String workerName = sc.nextLine();
    System.out.print("Nivel: ");
    String workerLevel = sc.nextLine();
    System.out.print("Salario base: ");
    double baseSalary = sc.nextDouble();

    Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

    System.out.print("Quantos contratos para esse trabalhador? ");
    int n = sc.nextInt();

    for (int i=1; i<=n; i++) {
      System.out.println("Coloque o contrato #" + i + " data:");
      System.out.print("Data (DD/MM/YYYY)");
      Date contractDate = sdf.parse(sc.next());
      System.out.print("Valor por hora: ");
      double valuePerHour = sc.nextDouble();
      System.out.print("Duração (Horas): ");
      int hours = sc.nextInt();
      HourContract contract = new HourContract(contractDate, valuePerHour, hours);
      worker.addContract(contract);
    }

    System.out.println();
    System.out.print("Coloque o mês e ano para calcular o salario (MM/YYYY): ");
    String monthAndYear = sc.next();
    int month = Integer.parseInt(monthAndYear.substring(0,2));
    int year = Integer.parseInt(monthAndYear.substring(3));
    System.out.print("Nome: " + worker.getName());
    System.out.print("Departamento: " + worker.getDepartment().getName());
    System.out.print("Salario para: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

    sc.close();
  }
}
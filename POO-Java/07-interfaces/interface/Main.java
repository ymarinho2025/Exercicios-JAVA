import model.services.BrazilTaxService;
import model.entities.CarRental;
import model.services.RentalService;
import model.entities.Vehicle;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque as informações de aluguel");
        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();

        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        BrazilTaxService taxService = new BrazilTaxService();

        System.out.println("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();

        System.out.println("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.printf("PAGAMENTO BASICO:%.2f%n", cr.getInvoice().getBasicPayment());
        System.out.printf("IMPOSTO: %.2f%n", cr.getInvoice().getTax());
        System.out.printf("PAGAMENTO TOTAL: %.2f%n", cr.getInvoice().getTotalPayment());

        sc.close();
    }
}

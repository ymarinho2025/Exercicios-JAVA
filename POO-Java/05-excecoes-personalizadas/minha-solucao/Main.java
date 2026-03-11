import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Sala numero: ");
        int sala = sc.nextInt();
        sc.nextLine();

        System.out.print("Data check-in (dd/MM/yyyy): ");
        String stringCheckin = sc.nextLine();
        LocalDate checkin = LocalDate.parse(stringCheckin, fmt1);

        System.out.print("Data check-out (dd/MM/yyyy): ");
        String stringCheckout = sc.nextLine();
        LocalDate checkout = LocalDate.parse(stringCheckout, fmt1);

        if (checkin.isAfter(checkout)) {
            System.out.println("Erro na reserva: a data do Check-out deve ser depois da data de Check-in");
        } else {
        	long nights = ChronoUnit.DAYS.between(checkin, checkout);
        	System.out.println("Reservação: Sala " + sala + ", check-in: " + checkin + ", check-out: " + checkout + ", " + nights + " noites");
        }

        System.out.println("Coloque as informações para atualizar a reserva:");
        System.out.print("Data check-in (dd/MM/yyyy): ");
        String stringNewCheckin = sc.nextLine();
        LocalDate newCheckin = LocalDate.parse(stringNewCheckin, fmt1);

        System.out.print("Data check-out (dd/MM/yyyy): ");
        String stringNewCheckout = sc.nextLine();
        LocalDate newCheckout = LocalDate.parse(stringNewCheckout, fmt1);
       
        if (newCheckin.isAfter(checkin) && newCheckout.isAfter(checkout) && newCheckout.isAfter(newCheckin)) {
        	long newnights = ChronoUnit.DAYS.between(newCheckin, newCheckout);
        	System.out.println("Reservação: Sala " + sala + ", check-in: " + newCheckin + ", check-out: " + newCheckout + ", " + newnights + " noites");
        }
        
        else if (newCheckin.isAfter(newCheckout)) {
            System.out.println("Erro na reserva: a data do Check-out deve ser depois da data de Check-in");
        }
        
        else {
        	System.out.println("Erro na reserva: a data atualizada da reserva deve ser datas futuras");
        }
        
        sc.close();
    }
}

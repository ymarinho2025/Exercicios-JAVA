import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.Reservation;
public class Main {

    public static void main(String[] args)  throws ParseException {

    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Sala numero: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Data check-in (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.print("Data check-out (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        Reservation reservation = new Reservation(number, checkIn, checkOut);

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: a data do Check-out deve ser depois da data de Check-in");
        } else {
        	System.out.println("Reserva: " + reservation);
        }

        System.out.println("");
        System.out.println("Coloque as informações para atualizar a reserva:");
        System.out.print("Data check-in (dd/MM/yyyy): ");
        checkIn = sdf.parse(sc.next());

        System.out.print("Data check-out (dd/MM/yyyy): ");
        checkOut = sdf.parse(sc.next());
        
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
        	System.out.println("Erro na reserva: a data atualizada da reserva deve ser datas futuras");
        }
        else if (!checkOut.after(checkIn)) {
        	System.out.println("Erro na reserva: a data do Check-out deve ser depois da data de Check-in");

        }
        else {
            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reserva: " + reservation);
        }
        sc.close();
    }
}

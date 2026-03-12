import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.Reservation;
import model.exceptions.DomainException;
public class Main {

    public static void main(String[] args) {

    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        
        try {
	        System.out.print("Sala numero: ");
	        int number = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Data check-in (dd/MM/yyyy): ");
	        Date checkIn = sdf.parse(sc.next());
	        System.out.print("Data check-out (dd/MM/yyyy): ");
	        Date checkOut = sdf.parse(sc.next());
	        
	        	Reservation reservation = new Reservation(number, checkIn, checkOut);
	        	System.out.println("Reserva: " + reservation);
	
	        System.out.println("");
	        System.out.println("Coloque as informações para atualizar a reserva:");
	        System.out.print("Data check-in (dd/MM/yyyy): ");
	        checkIn = sdf.parse(sc.next());
	        System.out.print("Data check-out (dd/MM/yyyy): ");
	        checkOut = sdf.parse(sc.next());
	       
	        reservation.updateDates(checkIn, checkOut);
	        System.out.println("Reserva: " + reservation);
	        }
        catch (ParseException e) {
        	System.out.println("Formato de data invalido");
        }
        catch (DomainException e) {
        	System.out.println("Erro na reserva: " + e.getMessage());
        }
        
        sc.close();
}
}

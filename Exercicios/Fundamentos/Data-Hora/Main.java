import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
  public static void main(String[] args) {

    // INSTANCIANDO DATA E HORA
// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
    DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now();

    LocalDate d04 = LocalDate.parse("2022-01-20");
    LocalDateTime d05 = LocalDateTime.parse("2022-01-20T11:24:26");

    Instant d06 = Instant.parse("2022-01-20T01:30:26Z");
    Instant d07 = Instant.parse("2022-01-20T11:24:26-03:00");

    LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
    LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
    LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
    LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

    LocalDate d08 = LocalDate.parse("20/04/2022", fmt1);
    LocalDateTime d09 = LocalDateTime.parse("20/04/2022 01:30", fmt2);

    LocalDate d10 = LocalDate.of(2022, 7, 20);
    LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 01, 30);

    System.out.println("INSTANCIANDO DATA E HORA\n");

    // INSTANCIANDO DATA E HORA
    System.out.println("d01 = " + d01);
    System.out.println("d02 = " + d02);
    System.out.println("d03 = " + d03);
    System.out.println("d04 = " + d04);
    System.out.println("d05 = " + d05);
    System.out.println("d06 = " + d06);
    System.out.println("d07 = " + d07);
    System.out.println("d08 = " + d08);
    System.out.println("d09 = " + d09);
    System.out.println("d10 = " + d10);
    System.out.println("d11 = " + d11);
    //

    System.out.println("\n-------------------------------------------------------------\n");
    System.out.println("CONVERTENDO DATA-HORA PARA TEXTO\n");

    // CONVERTENDO DATA-HORA PARA TEXTO
    System.out.println("d04 com fmt1 = " + d04.format(fmt1));
    System.out.println("d04 com format = " + fmt1.format(d04));
    System.out.println("d04 com format = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    System.out.println("d05 com fmt1 = " + d05.format(fmt1));
    System.out.println("d05 com fmt2 = " + d05.format(fmt2));
    System.out.println("d05 com fmt4 = " + d05.format(fmt4));
    System.out.println("d05 com format = " + fmt2.format(d05));
    System.out.println("d05 com format = " + d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

    System.out.println("d06 com fmt3 = " + fmt3.format(d06));
    System.out.println("d06 com fmt5 = " + fmt5.format(d06));
    System.out.println("d06 com toString = " + d06.toString());
    //

    System.out.println("\n-------------------------------------------------------------\n");
    System.out.println("CONVERTENDO DATA-HORA GLOBAL PARA LOCAL\n");

    // CONVERTENDO DATA-HORA GLOBAL PARA LOCAL
    System.out.println("conseguir dia d04 = " + d04.getDayOfMonth());
    System.out.println("conseguir mês d04 = " + d04.getMonthValue());
    System.out.println("conseguir ano d04 = " + d04.getYear());

    System.out.println("conseguir hora d05 = " + d05.getHour());
    System.out.println("conseguir minuto d05 = " + d05.getMinute());
    System.out.println("conseguir segundo d05 = " + d05.getSecond());

    System.out.println("r1 do d06 = " + r1);
    System.out.println("r2 do d06 = " + r2);
    System.out.println("r3 do d06 = " + r3);
    System.out.println("r4 do d06 = " + r4);
    //

    System.out.println("\n-------------------------------------------------------------\n");
    System.out.println("CALCULOS COM DATA-HORA\n");

    // CALCULOS COM DATA-HORA

    LocalDate pastWeekLocalDate = d04.minusDays(7);
    System.out.println("Semana passada do d04 " + pastWeekLocalDate);

    LocalDate nextWeekLocalDate = d04.plusDays(7);
    System.out.println("Semana que vem do d04 " + nextWeekLocalDate);

    LocalDateTime nextHoursLocalDateTime = d05.plusHours(12);
    System.out.println("cinco horas após d05 " + nextHoursLocalDateTime);

    LocalDateTime pastHoursLocalDateTime = d05.minusHours(12);
    System.out.println("cinco horas antes d05 " + pastHoursLocalDateTime);

    Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
    System.out.println("Semana passada do d06 " + pastWeekInstant);

    Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
    System.out.println("Semana que vem do d06 " + nextWeekInstant);

    Duration t1 = Duration.between(pastWeekInstant, d06);
    System.out.println("dias até o d06: " + t1.toDays());

    Duration t2 = Duration.between(d06, pastWeekInstant);
    System.out.println("dias que passaram no d06 : " + t2.toDays());

    Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0));
    System.out.println("dias até o d04: " + t3.toDays());


    /*
    for (String s : ZoneId.getAvailableZoneIds()) {
      System.out.println(s);
    }
    */


  }
}
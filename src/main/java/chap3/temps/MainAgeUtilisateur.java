package chap3.temps;

import java.time.*;

public class MainAgeUtilisateur {
    static void main() {
        Instant startInstant = Instant.now();
        // Alternative 1
        LocalDateTime startDateTime = LocalDateTime.now();
        // Alternative 2
        LocalDateTime startDateTimeFromInstant = LocalDateTime.ofInstant(startInstant, ZoneId.systemDefault());
        LocalDate startDate = LocalDate.of(2000, 1, 1);
        LocalDate endDate = LocalDate.now();

        Period period = Period.between(startDate, endDate);
        System.out.printf("Age du capitaine %s ans %s mois %d jours %n", period.getYears(), period.getMonths(), period.getDays());

        Instant endInstant = Instant.now();
        System.out.printf("Temps d'execution %d ms%n", Duration.between(startInstant, endInstant).toMillis());
        System.out.printf("Temps d'execution %d ms%n", Duration.between(startDateTime, LocalDateTime.now()).toMillis());
        System.out.printf("Temps d'execution %d ms%n", Duration.between(startDateTimeFromInstant, LocalDateTime.ofInstant(endInstant, ZoneId.systemDefault())).toMillis());

        System.out.printf("%d", endInstant.toEpochMilli() - startInstant.toEpochMilli());

    }
}

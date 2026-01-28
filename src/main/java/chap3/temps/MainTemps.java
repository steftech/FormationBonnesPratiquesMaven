package chap3.temps;

import java.time.Instant;
import java.time.LocalDateTime;

public class MainTemps {
    static void main() throws InterruptedException {
        LocalDateTime ldtStart = LocalDateTime.now();
        Instant start = Instant.now();
        System.out.printf("Start%n");
        Thread.sleep(565);
        Instant end = Instant.now();
        LocalDateTime ldtEnd = LocalDateTime.now();
        System.out.printf("End%n");

        System.out.printf("%s - %s : %.2f ms%n ", start.toString(), end.toString(), (end.getNano() - start.getNano()) / 1000000.0);
        System.out.printf("Nano start %d%n ", start.getNano());
        System.out.printf("Nano end   %d%n ", end.getNano());

        System.out.printf("Duration end: %f%n", java.time.Duration.between(start, end).getNano() / 1000000.0);
        System.out.printf("Duration ldtEnd: %f%n", java.time.Duration.between(ldtStart, ldtEnd).getNano() / 1000000.0);

    }
}

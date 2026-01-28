package hors_formation.test_perf_chainage;

import java.time.Duration;
import java.time.Instant;

public class MainTest {
    private static int MAX = 1000000;

    static void main() {
        executionNonChaine();
        executionChaine();
        executionNonChaine();
        executionChaine();
    }

    private static void executionChaine() {
        Instant start2 = Instant.now();
        for (int i = 0; i < MAX; ++i) {
            ProduitChaine p = new ProduitChaine();
            p.setId("1").setNom("P1").setPrix(i);
        }
        Instant end2 = Instant.now();
        System.out.printf("Temps pour la création des %d elements en Chainé     : %d ms%n", MAX, Duration.between(start2, end2).toMillis());
    }

    private static void executionNonChaine() {
        Instant start1 = Instant.now();
        for (int i = 0; i < MAX; ++i) {
            Produit p = new Produit();
            p.setId("1");
            p.setNom("P1");
            p.setPrix(i);
        }
        Instant end1 = Instant.now();

        System.out.printf("Temps pour la création des %d elements en non chainé : %d ms%n", MAX, Duration.between(start1, end1).toMillis());
    }
}

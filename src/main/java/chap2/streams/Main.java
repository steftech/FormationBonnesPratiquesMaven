package chap2.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {
        List<Point> liste = new ArrayList<>(List.of(
                new Point(1, 2)
                , new Point(-3, 4)
                , new Point(5, -3)
                , new Point(0, 10)
                , new Point(2, 8)));
        // Avoir les abscisses
        List<Integer> listeAbscisses = new ArrayList<>();
        for (Point p : liste) {

            listeAbscisses.add(p.abscisse());
        }
        afficheListeInteger(listeAbscisses);

        // Avoir les abscisses positifs triées
        List<Integer> listeAbscissesPositifs = new ArrayList<>();
        for (Integer p : listeAbscisses) {
            if (p >= 0) {
                listeAbscissesPositifs.add(p);
            }
        }
        Collections.sort(listeAbscissesPositifs);
        afficheListeInteger(listeAbscissesPositifs);

    }

    private static void afficheListeInteger(List<Integer> liste) {
        String sep = "";
        for (Integer p : liste) {
            System.out.print(sep + p );
            sep = ",";
        }
        System.out.println();
    }

    private static void afficheListe(List<Point> liste) {
        String sep = "";
        for (Point p : liste) {
            System.out.print(sep + p + ",");
            sep = ",";
        }
        System.out.println();
    }

}

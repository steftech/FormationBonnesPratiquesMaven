package chap2.exemple_pf;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Point> liste = new ArrayList<>(List.of(
                new Point(1, 1),
                new Point(5, 2),
                new Point(3, 5)));

        // Tri par Abscisses
        liste.sort((p1, p2) -> Integer.compare(p1.getAbscisse(), p2.getAbscisse()));
        System.out.println("Tri par Abscisses");
        afficheListe(liste);

        // Tri par Ordonnées
        liste.sort((p1, p2) -> Integer.compare(p1.getOrdonnee(), p2.getOrdonnee()));
        System.out.println("Tri par Ordonnee");
        afficheListe(liste);

        // Tri par distance euclidienne
        System.out.println("Tri par Distance Euclidienne");
        liste.sort((p1, p2) -> Double.compare(distanceEuclidienne(p1), distanceEuclidienne(p2)));
        afficheListe(liste);
    }

    private static double distanceEuclidienne(Point p1) {
        return Math.sqrt(
                Math.pow(p1.getAbscisse(), 2) + Math.pow(p1.getOrdonnee(), 2)
        );
    }

    private static void afficheListe(List<Point> liste) {
        for (Point p : liste) {
            System.out.print(p + ",");
        }
        System.out.println();
    }
}

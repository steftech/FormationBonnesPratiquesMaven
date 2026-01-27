package chap2.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {
    static void main() {
        List<Point> liste = new ArrayList<>(List.of(
                new Point(1, 2)
                , new Point(-3, 4)
                , new Point(5, -3)
                , new Point(0, 10)
                , new Point(2, 8)));
        // Avoir les abscisses
        List<Integer> listeOut = liste
                .stream()
                .map(p -> p.abscisse())
                .filter(e -> e >= 0)
                .sorted()
                .collect(Collectors.toList());

        afficheListeInteger(listeOut);
        List<Point> listeOut2 = liste
                .stream()
                .filter(e -> e.abscisse() >= 0)
                .sorted((p1, p2) -> Integer.compare(p1.abscisse(), p2.abscisse()))
                .collect(Collectors.toList());
        afficheListe(listeOut2);
    }

    private static void afficheListeInteger(List<Integer> liste) {
        String sep = "";
        for (Integer p : liste) {
            System.out.print(sep + p);
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

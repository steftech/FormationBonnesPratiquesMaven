package chap2.exercice_refactoring_lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Point> listePoints = new ArrayList<>(List.of(
                new PointColore(0, 5, Couleur.Blanc)
                , new PointColore(-5, 0, Couleur.Jaune)
                , new Point(-25, 0)
                , new PointColore(5, 7, Couleur.Vert)
                , new PointColore(10, 25, Couleur.Noir)
                , new PointColore(7, 5, Couleur.Jaune)
                , new PointColore(107, 5, Couleur.Jaune)
                , new Point(-15, 17)
                , new PointColore(7, 505, Couleur.Jaune)
                , new PointColore(17, 5, Couleur.Jaune)
                , new PointColore(7, 55, Couleur.Jaune)
                , new PointColore(10, 5, Couleur.Jaune)
                , new PointColore(7, 5, Couleur.Jaune)
        ));

        List<Double> listePointsFiltre = getTop5PointsJaunesProcheOrigine(listePoints);
        afficheListe(listePointsFiltre);

    }

    private static List<Double> getTop5PointsJaunesProcheOrigine(List<Point> listePoints) {
        return listePoints.stream()
                .filter(p -> p instanceof PointColore pc && pc.getCouleur() == Couleur.Jaune)
                .sorted((p1, p2) -> Double.compare(p1.getDistance(), p2.getDistance()))
                .map(p -> p.getDistance())
                .limit(5)
                .toList();
    }

    private static <T> void afficheListe(List<T> liste) {
        String sep = "";
        for (T p : liste) {
            System.out.print(sep + p + ",");
            sep = ",";
        }
        System.out.println();
    }

}

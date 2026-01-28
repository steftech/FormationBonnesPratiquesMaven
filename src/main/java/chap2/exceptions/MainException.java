package chap2.exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainException {
    static void main() {
        Scanner sc = new Scanner(System.in);
        List<Point> points = new ArrayList<>();
        final int MAX = 3;
        int i = 0;
        while (i < MAX) {
            points.add(saisiePoint(sc));
            ++i;
        }

        for (Point p : points) {
            System.out.printf(p.toString());
        }
    }

    private static Point saisiePoint(Scanner sc) {
        Point p;
        try {
            sc.reset();
            System.out.print("Entrez l'abscisse du point : ");
            int x = sc.nextInt();
            System.out.print("Entrez l'ordonnée du point : ");
            int y = sc.nextInt();
            p = new Point(x, y);
        } catch (IllegalPointException | InputMismatchException e) {
            System.err.println("Erreur dans la saisie : " + e.getMessage());
            p = saisiePoint(sc);
        }
        return p;
    }
}

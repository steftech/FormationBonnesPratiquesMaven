package chap4.teared_compiltation;

public class Calcul {
    public static int somme(int[] valeurs) {
        int total = 0;
        for (int v : valeurs) {
            total += v;
        }
        return total;
    }

    public static void main() {
        int[] tableau = new int[1000];
        // initialisation
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i;
        }
        System.out.println("Demo JIT Tiered Compilation");
        execution(100, tableau);
        execution(1500, tableau);
        execution(10000, tableau);


        execution(100, tableau);
        execution(1500, tableau);
        execution(10000, tableau);
    }

    private static void execution(int nb, int[] tableau) {
        System.out.printf("Tableau de 1000 elements traité %d fois%n", nb);
        long debut = System.nanoTime();
        for (int i = 0; i < nb; ++i) {
            somme(tableau);
        }
        long fin = System.nanoTime();
        System.out.printf("Tiered compilation took %f ns%n", (fin - debut) / nb * 1.0);
    }
}

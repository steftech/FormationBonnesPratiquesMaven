package chap2.exercice_refactoring_lambda;

public class Point {
    private int abscisse;
    private int ordonne;
    public Point(int abscisse, int ordonne) {
        this.abscisse = abscisse;
        this.ordonne = ordonne;
    }
    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonne() {
        return ordonne;
    }
    public Double getDistance() {
        return Math.sqrt(Math.pow(abscisse, 2) + Math.pow(ordonne, 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "abscisse=" + abscisse +
                ", ordonne=" + ordonne +
                '}';
    }
}

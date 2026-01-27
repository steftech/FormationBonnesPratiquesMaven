package chap2.exemple_pf;

public class Point {
    private final int abscisse;
    private final int ordonnee;

    public Point(int abscisse, int ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }
    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    @Override
    public String toString() {
        return "Point{" +
                "abscisse=" + abscisse +
                ", ordonnee=" + ordonnee +
                '}';
    }
}

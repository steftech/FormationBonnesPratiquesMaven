package chap2.exemple_pf;

public class Point {
    private int abscisse;
    private int ordonnee;

    Point(int abscisse, int ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }
    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    @Override
    public String toString() {
        return "Point{" +
                "abscisse=" + abscisse +
                ", ordonnee=" + ordonnee +
                '}';
    }
}

package chap3.object_equals;

public class Point {
    private int abscisse;
    private int ordonnee;

    Point(int abscisse, int ordonnee) {
        setAbscisse(abscisse);
        setOrdonnee(ordonnee);
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
                "abscisse=" + this.getAbscisse() +
                ", ordonnee=" + this.getOrdonnee() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // Pattern Matching
        return o instanceof Point p
                && p.getAbscisse() == this.getAbscisse()
                && p.getOrdonnee() == this.getOrdonnee();
    }


}

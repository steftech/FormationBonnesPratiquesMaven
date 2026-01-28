package chap2.exceptions;

public class Point {
    private int abscisse;
    private int ordonnee;

    Point(int abscisse, int ordonnee) throws IllegalPointException {
        setAbscisse(abscisse);
        setOrdonnee(ordonnee);
    }

    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) throws IllegalPointException {
        if (abscisse < 0 ) {
            throw new IllegalPointException("abscisse doit être positive");
        }
        this.abscisse = abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) throws IllegalPointException{
        if (ordonnee < 0 ) {
            throw new IllegalPointException("ordonnée doit être positive");
        }
        this.ordonnee = ordonnee;
    }

    @Override
    public String toString() {
        return "Point{" +
                "abscisse=" + this.getAbscisse() +
                ", ordonnee=" + this.getOrdonnee() +
                '}';
    }
}

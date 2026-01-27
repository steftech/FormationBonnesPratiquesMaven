package chap2.exemple_pf_corrige;

public record Point(int abscisse, int ordonnee) {
    public double distanceEuclidienne() {
        return Math.sqrt(
                Math.pow(abscisse(), 2) + Math.pow(ordonnee(), 2)
        );
    }
}

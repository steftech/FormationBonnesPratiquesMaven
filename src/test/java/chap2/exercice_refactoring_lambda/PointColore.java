package chap2.exercice_refactoring_lambda;

public class PointColore extends Point{
    private Couleur couleur;
    PointColore(int abscisse, int ordonnee, Couleur couleur) {
        super(abscisse, ordonnee);
        this.couleur = couleur;
    }
    public Couleur getCouleur() {
        return couleur;
    }
    @Override
    public String toString() {
        return "PointColore{" +
                "abscisse=" + getAbscisse() +
                ", ordonne=" + getOrdonne() +
                ", couleur=" + getCouleur() +
                ", distance =" + getDistance() +
                '}';
    }
}

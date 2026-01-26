package chap1.premier.entities;

public class Place {
    private final String nom;
    private final String prenom;
    private static final double PRIX_PLACE = 20;

    Place(String nom, String prenom) {
        super();
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return String.format("%s - %s : %.02f%n", getNom(), getPrenom(), PRIX_PLACE);
    }


}

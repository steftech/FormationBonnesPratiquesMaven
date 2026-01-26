package chap1.tests;

public class LigneDeCommande {
    private final String nom;
    private final Integer qte;
    private final Double prix;

    public LigneDeCommande(String nom, Integer qte, Double prix) {
        this.nom = nom;
        this.qte = qte;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public Integer getQte() {
        return qte;
    }

    public Double getPrix() {
        return prix;
    }
}

package hors_formation.test_perf_chainage;

public class ProduitChaine {
    private String id;
    private String nom;
    private Integer prix;

    ProduitChaine() {
    }

    public String getId() {
        return id;
    }

    public ProduitChaine setId(String id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public ProduitChaine setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public Integer getPrix() {
        return prix;
    }

    public ProduitChaine setPrix(Integer prix) {
        this.prix = prix;
        return this;
    }
}

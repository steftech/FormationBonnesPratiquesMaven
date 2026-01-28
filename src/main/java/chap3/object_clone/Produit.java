package chap3.object_clone;

public class Produit implements Cloneable {
    private int id;
    private String libelle;
    private double prix;

    public Produit(int id, String libelle, double prix) {
        setId(id);
        setLibelle(libelle);
        setPrix(prix);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", prix=" + prix +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
//        return new Produit(getId(), getLibelle(), getPrix());
    }

}

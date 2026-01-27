package chap2.annotations;

@JsonSerializable
public class Personne {
    @JsonElement
    private String nom;
    @JsonElement
    private String prenom;
    @JsonElement(key="agePersonne")
    private String age;
    private String adresse;

    public Personne(String nom,
             String prenom,
             String age,
             String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Init
    private void initNames(){
        this.prenom = this.prenom.substring(0, 1).toUpperCase() + this.prenom.substring(1);
        this.nom = this.nom.substring(0, 1).toUpperCase() + this.nom.substring(1);
    }

}

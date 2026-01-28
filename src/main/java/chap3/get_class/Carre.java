package chap3.get_class;

public class Carre extends FormesGeometriques {
    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double getSuperficie() {
        return Math.pow(getCote(), 2);
    }
}

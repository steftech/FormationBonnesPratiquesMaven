package chap3.get_class;

public class Disque extends FormesGeometriques {
    double rayon;

    public Disque(double rayon) {
        this.rayon = rayon;
    }

    public double getSuperficie() {
        return Math.pow(rayon, 2) * Math.PI;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}

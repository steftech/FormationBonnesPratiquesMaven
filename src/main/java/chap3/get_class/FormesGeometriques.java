package chap3.get_class;

public abstract class FormesGeometriques {
    public abstract double getSuperficie();

    @Override
    public String toString() {
        return "FormesGeometriques {" +
                " type : " + getClass().getSimpleName() +
                ", superficie : " + getSuperficie() +
                "}";
    }
}

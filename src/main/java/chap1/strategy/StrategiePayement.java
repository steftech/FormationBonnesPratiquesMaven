package chap1.strategy;

@FunctionalInterface
public interface StrategiePayement {
    void payer(double montant);
}

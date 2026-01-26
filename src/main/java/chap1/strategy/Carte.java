package chap1.strategy;

public class Carte implements StrategiePayement {
    @Override
    public void payer(double montant) {
        System.out.printf("payement par carte : %.2f%n", montant);
    }
}

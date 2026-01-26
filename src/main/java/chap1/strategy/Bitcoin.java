package chap1.strategy;

public class Bitcoin implements StrategiePayement {

    @Override
    public void payer(double montant) {
        System.out.printf("Bitcoin payement montant: %.2f%n", montant);
    }
}

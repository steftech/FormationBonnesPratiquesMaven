package chap1.strategy;

public class ServicePayement {
    void payer(StrategiePayement strategiePayement, double montant){
        if (strategiePayement == null ){
            throw new IllegalArgumentException("Aucune stratégie n'a été spécifiée");
        }
        strategiePayement.payer(montant);
    }
}

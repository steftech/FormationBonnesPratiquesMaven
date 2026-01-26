package chap1.strategy;

public class Main {
    static void main() {
        ServicePayement sp = new ServicePayement();
        sp.payer(new Carte(), 100);
        sp.payer(new Bitcoin(), 57);
    }
}

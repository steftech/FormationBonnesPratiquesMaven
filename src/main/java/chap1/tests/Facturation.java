package chap1.tests;

import java.util.ArrayList;
import java.util.List;

public class Facturation {
    List<LigneDeCommande> lignes = new ArrayList<>();

    public Facturation() {
    }

    public void addLigneDeCommande(LigneDeCommande l) {
        lignes.add(l);
    }

    public double getSommeFacture() {
        double result = 0;
        for (LigneDeCommande l : lignes) {
            result += l.getPrix() * l.getQte();
        }
        return result;
    }

}

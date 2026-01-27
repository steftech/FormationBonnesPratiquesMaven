package chap2.programmation_fonctionnelle;

import java.util.Comparator;

public class IdProduitComparateur implements Comparator<Produit> {
    @Override
    public int compare(Produit p1, Produit p2) {
        return (Integer.compare(p1.getId(), p2.getId()));
    }
}

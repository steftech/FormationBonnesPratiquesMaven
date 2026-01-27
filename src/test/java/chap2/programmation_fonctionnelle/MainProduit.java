package chap2.programmation_fonctionnelle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainProduit {
    static void main() {
        List<Produit> stock = new ArrayList<>(List.of(
                new Produit(135, "PC", 900),
                new Produit(5, "Souris", 20),
                new Produit(7, "Clavier", 25)
        )
        );
        // Tri par Id
        stock.sort(new IdProduitComparateur());
        System.out.println(stock);

        // Tri par nom - Classe Anonyme
        stock.sort(new Comparator<Produit>() {
            @Override
            public int compare(Produit p1, Produit p2) {
                return p1.getLibelle().compareTo(p2.getLibelle());
            }
        });
        System.out.println(stock);

        // Tri par prix - Lambda
        stock.sort((p1, p2) -> Double.compare(p1.getPrix(), p2.getPrix()));
        System.out.println(stock);

        //  Equivalent à :
        stock.sort((Produit p1, Produit p2) -> {
            return Double.compare(p1.getPrix(), p2.getPrix());
        });


        stock.sort(Comparator.comparingDouble(Produit::getPrix));
    }
}

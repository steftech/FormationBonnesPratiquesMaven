package chap3.object_clone;

public class MainClone {
    static void main() throws CloneNotSupportedException {
        Produit p = new Produit(1, "Savon", 5);
        System.out.printf("%s%n", p);

        Produit p2 = (Produit) p.clone();
        System.out.printf("%s%n", p2);
    }
}

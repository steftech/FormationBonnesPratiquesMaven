package chap3.get_class;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<FormesGeometriques> formesGeometriques = new ArrayList<>();

        formesGeometriques.add(new Carre(10));
        formesGeometriques.add(new Disque(10));

        for (FormesGeometriques forme : formesGeometriques) {
            System.out.printf("forme : %s\n", forme);
        }
    }
}

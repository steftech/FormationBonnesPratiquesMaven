package chap2.copie_defensive;

import java.util.ArrayList;
import java.util.List;

public class MainCopieDefensive {
    static void main() {
        Personne p = new Personne("Larson", new ArrayList<>(List.of("A1", "A2", "A3")));
        p.addresses().add("A4");
        System.out.println(p.addresses());
    }
}

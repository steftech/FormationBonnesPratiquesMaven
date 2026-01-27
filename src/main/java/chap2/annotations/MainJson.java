package chap2.annotations;

import java.lang.reflect.InvocationTargetException;

public class MainJson {
    static void main() {
        Personne p = new Personne("larson", "stéphane", "51", "ici");
        try {
            String s = ObjetToJson.convertToJson(p);
            System.out.println(s);
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}

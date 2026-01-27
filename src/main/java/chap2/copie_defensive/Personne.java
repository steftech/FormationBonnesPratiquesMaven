package chap2.copie_defensive;

import java.util.ArrayList;
import java.util.List;

public record Personne(String non, List<String> addresses) {
    public List<String> addresses() {
        // Copie défenssive
        return new ArrayList<>(addresses);
    }
}

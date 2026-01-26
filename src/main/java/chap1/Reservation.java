package chap1;

import java.util.LinkedList;

public class Reservation {
    private final LinkedList<Place> listeDeReservation = new LinkedList<>();

    public Reservation() {
        super();
    }

    public void addPlace(String nom, String prenom) {
        listeDeReservation.push(new Place(nom, prenom));
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Place place : listeDeReservation) {
            res.append(place.toString());
        }
        return res.toString();
    }
}

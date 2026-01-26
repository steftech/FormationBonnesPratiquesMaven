package chap1;

public class Main {
    static void main() {
        Reservation reservation = new Reservation();
        reservation.addPlace("LARSON", "Stéphane");
        reservation.addPlace("BOUCHER", "Jordan");
        reservation.addPlace("SAILLY", "Eric");

        System.out.println(reservation);

    }
}

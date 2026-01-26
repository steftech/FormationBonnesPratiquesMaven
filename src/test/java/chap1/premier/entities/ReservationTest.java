package chap1.premier.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    @Test
    void addPlace() {
        Reservation reservation = new Reservation();
        reservation.addPlace("BOUCHER", "Jordan");
        reservation.addPlace("SAILLY", "Eric");
        assertEquals("""
                SAILLY - Eric : 20,00\r
                BOUCHER - Jordan : 20,00\r
                """, reservation.toString());
    }

}
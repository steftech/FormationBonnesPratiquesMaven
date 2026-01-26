package chap1.premier.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

@ParameterizedTest
class PlaceTest {

    @Test
    void getNom() {
        Place p = new Place("LARSON", "Stéphane");
        assertEquals("LARSON", p.getNom());
    }

    @Test
    void getPrenom() {
        Place p = new Place("LARSON", "Stéphane");
        assertEquals("Stéphane", p.getPrenom());
    }

    @Test
    void testToString() {
        Place p = new Place("LARSON", "Stéphane");
        assertEquals("LARSON - Stéphane : 20,00\r\n", p.toString());
    }
}
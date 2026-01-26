package chap1.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturationTest {
    @Test
    public void should_SommeFactureCorrecte_when_PlusieursLigneDeCommande() {
        // Arrange :
        Facturation f = new Facturation();
        f.addLigneDeCommande(new LigneDeCommande("Objet 1", 2, 13.37));
        f.addLigneDeCommande(new LigneDeCommande("Objet 2", 5, 10.00));
        // Act :
        double somme = f.getSommeFacture();
        // Assert
        assertEquals(76.74, somme);
    }

    @Test
    public void should_SommeFactureCorrecte_when_UneLigneDeCommande() {
        // Arrange :
        Facturation f = new Facturation();
        f.addLigneDeCommande(new LigneDeCommande("Objet 1", 2, 13.37));
        // Act :
        double somme = f.getSommeFacture();
        // Assert
        assertEquals(26.74, somme);
    }

    @Test
    public void should_SommeFactureCorrecte_when_AucuneLigneDeCommande() {
        // Arrange :
        Facturation f = new Facturation();
        // Act :
        double somme = f.getSommeFacture();
        // Assert
        assertEquals(0, somme);
    }

    @Test
    public void should_Exception_when_QuantiteNull() {
        try {
            // Arrange :
            Facturation f = new Facturation();
            f.addLigneDeCommande(new LigneDeCommande("Objet 1", null, 13.37));
            // Act :

            double somme = f.getSommeFacture();
            // Assert
            fail();
        } catch (Exception e) {
            assertEquals(NullPointerException.class, e.getClass());
        }
    }

    @Test
    public void should_Exception_when_PrixNull() {
        try {
            // Arrange :
            Facturation f = new Facturation();
            f.addLigneDeCommande(new LigneDeCommande("Objet 1", 2, null));
            // Act :
            double somme = f.getSommeFacture();
            // Assert
            fail();
        } catch (Exception e) {
            assertEquals(NullPointerException.class, e.getClass());
        }
    }

    @Test
    public void should_Exception_when_QuantiteNulle_Alt() {
        // Arrange :
        Facturation f = new Facturation();
        f.addLigneDeCommande(new LigneDeCommande("Objet 1", null, 13.37));
        // Act & Assert:
        assertThrows(NullPointerException.class, () -> f.getSommeFacture(), "Exception attendue, Quantité nulle");         // Optionally check the exception message        assertEquals("/ by zero", exception.getMessage());
    }


}
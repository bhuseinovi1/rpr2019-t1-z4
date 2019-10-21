package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl artikl= new Artikl("Frizider",400,"1");
        assertEquals("Frizider",artikl.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl artikl= new Artikl("Frizider",400,"1");
        assertEquals(400,artikl.getCijena());
    }

    @Test
    void getKod() {
        Artikl artikl= new Artikl("Frizider",400,"1");
        assertEquals("1",artikl.getKod());
    }
}
package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Artikl a = new Artikl("test",32,"3");
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(a);
        assertNotNull(supermarket.getArtikli());
    }

    @Test
    void getArtikli() {
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket=new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo",900,"1"));
        Artikl artikl = supermarket.izbaciArtiklSaKodom("1");
        assertEquals("1",artikl.getKod());
    }
}
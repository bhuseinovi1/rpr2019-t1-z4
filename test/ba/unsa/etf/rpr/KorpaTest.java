package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    //private Korpa korpa;
    @Test
    void dodajArtikl() {
        Artikl a = new Artikl("test",32,"3");
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(a);
        assertNotNull(korpa.getArtikli());
        assertEquals(korpa.dajUkupnuCijenuArtikala(),32);
    }

    @Test
    void getArtikli() {
    }

    @Test
    void getBrojArtikala() {
        Artikl a = new Artikl("test",32,"3");
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(a);
        assertEquals(1,korpa.getBrojArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo",900,"1"));
        Artikl artikl = korpa.izbaciArtiklSaKodom("1");
        assertEquals("1",artikl.getKod());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Artikl a = new Artikl("Luster",50,"1");
        Artikl a1 = new Artikl("Ormar",250,"2");
        Korpa k = new Korpa();
        k.dodajArtikl(a);
        k.dodajArtikl(a1);
        assertEquals(300,k.dajUkupnuCijenuArtikala());
    }
}
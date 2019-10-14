package ba.unsa.etf.rpr;

public class Korpa {
    private int brojArtikala=0;
    private Artikl[] Artikli = new Artikl[50];

    public boolean dodajArtikl(Artikl a) {
        if(brojArtikala==50) return false;
        Artikli[brojArtikala] = new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
        brojArtikala++;
        return true;
    }

    public Artikl[] getArtikli() {
        return Artikli;
    }

    public int getBrojArtikala() {
        return brojArtikala;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a1 = null;
        Petlja: for(int i=0;i<brojArtikala;i++) {
            if (this.Artikli[i] != null) {
                if (this.Artikli[i].getKod().equals(kod)) {
                    a1 = new Artikl(this.Artikli[i].getNaziv(), this.Artikli[i].getCijena(), this.Artikli[i].getKod());
                    this.Artikli[i] = null;
                    break Petlja;
                }
            }
        }
        return a1;
    }

    public int dajUkupnuCijenuArtikala() {
        int uk=0;
        for(int i=0;i<brojArtikala;i++) {
            if (this.Artikli[i] != null) {
                uk+=this.Artikli[i].getCijena();
            }
        }
        return uk;
    }
}

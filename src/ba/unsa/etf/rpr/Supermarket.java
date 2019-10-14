package ba.unsa.etf.rpr;

public class Supermarket {
    private int trenutnoArtikala = 0;
    Artikl[] Artikli = new Artikl[1000];
    public void dodajArtikl(Artikl a) {
        if(trenutnoArtikala<1000) {
            Artikli[trenutnoArtikala] = new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
            trenutnoArtikala++;
        }
    }

    public Artikl[] getArtikli() {
        return Artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        /*for(Artikl a : Artikli) {
            if(a!=null) {
            if (a.getKod().equals(kod)) {
                trenutnoArtikala--;
                return a;
            }}
        }
        return null;

         */
        Artikl a1 = null;
        Petlja: for(int i=0;i<trenutnoArtikala;i++) {
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
}

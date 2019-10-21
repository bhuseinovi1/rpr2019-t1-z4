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
        Artikl trazeni_artikl = null;
        Petlja: for(int i=0;i<trenutnoArtikala;i++) {
            if (this.Artikli[i] != null) {
                if (this.Artikli[i].getKod().equals(kod)) {
                    trazeni_artikl = new Artikl(this.Artikli[i].getNaziv(), this.Artikli[i].getCijena(), this.Artikli[i].getKod());
                    System.arraycopy(this.Artikli,i+1,this.Artikli,i,this.Artikli.length-1-i);
                    break Petlja;
                }
            }
        }
        return trazeni_artikl;
    }
}

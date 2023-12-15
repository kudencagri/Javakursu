package Gun34._02_soru;

public class Ilkokul extends Ogrenci{
    private String klup;
    public Ilkokul(String isim, Tipi tipi,String klup) {
        super(isim, tipi);
        setKlup(klup);

    }

    @Override
    public String toString() {
        return super.toString()+"Klüp="+this.klup;
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }
}

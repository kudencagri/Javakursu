package Gun34._02_soru;

public class LiseOgrencisi extends Ogrenci {

    private String brans;

    public LiseOgrencisi(String isim, Tipi tipi,String brans) {
        super(isim, tipi);
        setBrans(brans);
    }

    public LiseOgrencisi(String isim, Tipi tipi) {
        super(isim, tipi);
    }

    @Override
    public String toString() {
        return super.toString()+"Branş="+this.brans;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}

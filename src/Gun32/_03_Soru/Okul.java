package Gun32._03_Soru;

import java.util.ArrayList;

public class Okul {

    private String okulAd;
    private int Kontejan;
    private ArrayList<Ogrenci> ogrenciler=new ArrayList<>();

    public Okul(String okulAd, int kontejan) {
        this.okulAd = okulAd;
        Kontejan = kontejan;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontejan() {
        return Kontejan;
    }

    public void setKontejan(int kontejan) {
        Kontejan = kontejan;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", Kontejan=" + Kontejan +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}

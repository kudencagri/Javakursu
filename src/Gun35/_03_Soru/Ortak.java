package Gun35._03_Soru;

public class Ortak {
    private String ad;
    private String soyad;
    private String gorevi;

    public Ortak(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public static void KimlikBelgesi(Ortak ortak){
        System.out.println("\n ************ Kimlik Belgesi*********** " );

        System.out.println(" ad="+ortak.getAd() );
        System.out.println(" soyadı="+ortak.getSoyad() );
        System.out.println(" Görevi="+ortak.getGorevi() );

        if (ortak instanceof Calisan)
            System.out.println(" Departman="+((Calisan) ortak).getDepartman() );
        if (ortak instanceof Ogrenci)
            System.out.println(" Subesi="+((Ogrenci) ortak).getSubesi() );

    }

    public String getAd() {
        return ad;
    }


    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "Ortak  " +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\''
                ;
    }
}

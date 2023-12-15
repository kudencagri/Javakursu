package Gun33._01_Inharitance;

public class Personel {
    // personel açtın. ardından yönetici için işlem yapacan. personeldeki tüm veriler yöneticidede olacak ek olarak zamyap eklecenek
    // onun için uzun uzun yazma extends Personel yaz aynı alıyor sonra zamyap ekle dava biter.
    private String ad;
    private String soyad;
    private int yas;
    private double maas;
    private String deparman;
    private int sicilNo;
    private String telefon;
    private String tcNo;
    public  void  bordroYazdir(){
        System.out.println("bodro yazdırıldı");
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

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getDeparman() {
        return deparman;
    }

    public void setDeparman(String deparman) {
        this.deparman = deparman;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", maas=" + maas +
                ", deparman='" + deparman + '\'' +
                ", sicilNo=" + sicilNo +
                ", telefon='" + telefon + '\'' +
                ", tcNo='" + tcNo + '\'' +
                '}';
    }
}

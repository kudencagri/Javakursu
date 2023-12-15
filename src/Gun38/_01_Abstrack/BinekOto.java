package Gun38._01_Abstrack;

public abstract class BinekOto {// **abstrack ekleyince inter face dosyasına  gerek yok

    // parent class=
    // birden fazla classın ortak yönlerini tek bir classda toplayığ ordan
    // inheritance yapıp yazılım tekrarrını engellemek.


    //İnterface: yazılacak olan metodların listesinin olduğu ve sadece metodun
    // imzasının yer aldığı , yapılacaklar listtesi. her implement eden class
    // metodun içini kendine göre yazmak zorunda.
    private  String marka;
    private int uretimYili;
    abstract int hizlanmaSuresi(); // abstarc yapınca classı
    // metodlarıda abstrac eklemen lazım.

    public BinekOto(String marka, int uretimYili, int vitesAdedi) {
        setMarka(marka);
        setUretimYili(uretimYili);
        setVitesAdedi(vitesAdedi);
    }

    @Override
    public String toString() {
        return "BinekOto{" +
                "marka='" + marka + '\'' +
                ", uretimYili=" + uretimYili +
                ", vitesAdedi=" + vitesAdedi +
                '}';
    }

    private  int vitesAdedi;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}

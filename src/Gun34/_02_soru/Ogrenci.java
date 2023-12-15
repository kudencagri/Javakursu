package Gun34._02_soru;

public class Ogrenci {
    private  int id;
    private String isim;
    private  Tipi tipi;


    public  static int sayac=1;

    public Ogrenci(String isim, Tipi tipi) {
        setId(sayac++);
        setIsim(isim);
        setTipi(tipi);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Tipi getTipi() {
        return tipi;
    }

    public void setTipi(Tipi tipi) {
        this.tipi = tipi;
    }

    public static int getSayac() {
        return sayac;
    }

    public static void setSayac(int sayac) {
        Ogrenci.sayac = sayac;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }
}


package Gun30.soru_01_;

public class Vatandas {
    String isim;
    String Adres;
    final int tcNo;
    private static int sayac=12453746;

    public Vatandas(String isim, String adres) {
        this.isim = isim;
        Adres = adres;
        this.tcNo = sayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", Adres='" + Adres + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}

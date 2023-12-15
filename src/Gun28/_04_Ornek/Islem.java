package Gun28._04_Ornek;

public class Islem {
    String adi;
    int SubeSayisi;
    int KurulusYili;

    public Islem() {
    }

    public Islem(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        SubeSayisi = subeSayisi;
        KurulusYili = kurulusYili;
    }

    public Islem(String adi, int subeSayisi) {
        this.adi = adi;
        SubeSayisi = subeSayisi;
    }

    @Override
    public String toString() {
        return "Islem{" +
                "adi='" + adi + '\'' +
                ", SubeSayisi=" + SubeSayisi +
                ", KurulusYili=" + KurulusYili +
                '}';
    }
}

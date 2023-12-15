package Gun39._03_soru_;

public class Kartal extends Hayvan{
    public Kartal( String isim, Boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("fare yer ");
    }

    @Override
    void yemekMiktari() {
        System.out.println("250 gram yer");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("günde 6 saat");
    }

    @Override
    void sesi() {
        System.out.println(" vak vak vak ");
    }
}

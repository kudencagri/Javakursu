package Gun39._03_soru_;

public class Kedi extends Hayvan{
    public Kedi(String isim, Boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Balık yer");;
    }

    @Override
    void yemekMiktari() {
        System.out.println("150 gram ");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("günde 5 saat yatar.");
    }

    @Override
    void sesi() {
        System.out.println(" miyav miyav");
    }
}

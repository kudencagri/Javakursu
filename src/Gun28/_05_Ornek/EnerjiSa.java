package Gun28._05_Ornek;

public class EnerjiSa {
    public static void main(String[] args) {
        Musteri mus1=new Musteri();
        mus1.name="rıdoo";
        mus1.elektrikHesabi.tuketimekle(50);
        mus1.elektrikHesabi.tuketimekle(90);
        mus1.elektrikHesabi.tuketimekle(80);

        System.out.println("mus1 = " + mus1.elektrikHesabi.Tuketim_toplam);
        mus1.elektrikHesabi.FaturaYaz();


    }
}

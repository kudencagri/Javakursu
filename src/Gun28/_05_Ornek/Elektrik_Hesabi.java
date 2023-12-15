package Gun28._05_Ornek;

public class Elektrik_Hesabi {
    int Tuketim_toplam=0;
    double birim_fiyat=20;
    public void tuketimekle(int tuketim){
        Tuketim_toplam=Tuketim_toplam+tuketim;
    }
    public void FaturaYaz(){
        double tuketimTl=Tuketim_toplam*birim_fiyat;
        System.out.println("xxxxxxxxxxxxx");
        System.out.println("fiyatınız");
        System.out.println("xxxxxxxxxx");
        System.out.println("Tuketim_toplam = " + Tuketim_toplam);
        System.out.println("tuketimTl = " + tuketimTl);
    }
}

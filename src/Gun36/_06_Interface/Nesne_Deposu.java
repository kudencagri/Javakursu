package Gun36._06_Soru;

public class Nesne_Deposu implements IDikdortgen,IKare{
    @Override
    public void alan() {
        System.out.println("alan budur");
    }

    @Override
    public void cevre() {
        System.out.println("çevre budur");

    }

    @Override
    public void kenaruzunlugu() {
        System.out.println("kenar uzunlugu budur");

    }

    @Override
    public void kisaKenar() {
        System.out.println("kısa kenar budur");

    }

    @Override
    public void UzunKenar() {
        System.out.println("uzun kenar budur.");

    }
}

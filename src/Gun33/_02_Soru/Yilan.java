package Gun33._02_Soru;

public class Yilan extends Hayvan{
    private int uzunluk;

    @Override
    public void konustu() {
       // super.konustu();
        System.out.println("Tısladı");
    }

    @Override
    public String toString() {
        return super.toString()+"uzunluk="+this.uzunluk ;
    }

    public Yilan(String renk, int kilo, String cins, int uzunluk) {
        super(renk, kilo, cins);
        this.setUzunluk(uzunluk);
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
}

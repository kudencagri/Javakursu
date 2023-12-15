package Gun33._02_Soru;

public class Ordek extends Hayvan {

    private int KanatAcikligi;
    public Ordek(String renk, int kilo, String cins, int kanatAcikligi) {
        super(renk, kilo, cins);
        setKanatAcikligi(kanatAcikligi);
    }

    @Override
    public void konustu() {
        //super.konustu();
        System.out.println(" cik cik etti ");
    }

    @Override
    public String toString() {
        return super.toString()+"Kanat Açıklıgı "+this.KanatAcikligi;
    }

    public int getKanatAcikligi() {
        return KanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        KanatAcikligi = kanatAcikligi;
    }
}

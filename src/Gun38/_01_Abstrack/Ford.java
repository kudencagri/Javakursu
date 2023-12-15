package Gun38._01_Abstrack;

public class Ford extends BinekOto implements IBinekOto{// nesne üretelicek class tip
    public Ford(String marka, int uretimYili, int vitesAdedi) {
        super(marka, uretimYili, vitesAdedi);
    }

    @Override
    public int hizlanmaSuresi() {
        return 0;
    }
}

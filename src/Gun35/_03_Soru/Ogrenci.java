package Gun35._03_Soru;

public class Ogrenci extends Ortak {
    private String subesi;

    public Ogrenci(String ad, String soyad, String gorevi,String subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);
    }

    @Override
    public String toString() {
        return super.toString()+"Subesi"+this.subesi;
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }
}

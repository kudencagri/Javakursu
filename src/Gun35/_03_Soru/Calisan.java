package Gun35._03_Soru;

public class Calisan extends Ortak{

    private String departman;
    public Calisan(String ad, String soyad, String gorevi,String departman) {
        super(ad, soyad, gorevi);
        setDepartman(departman);
    }

    @Override
    public String toString() {
        return super.toString()+"Departmanı"+this.departman;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}

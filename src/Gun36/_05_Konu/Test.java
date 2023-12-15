package Gun36._05_Konu;

public class Test implements IGosterir,IYazdirir{
    @Override
    public void goster() {
        System.out.println("gösterdi");
    }

    @Override
    public void yazdir(String msg) {
        System.out.println(msg+"yazdirildi");

    }

    @Override
    public void yaz() {
        System.out.println("çıktı yazdırıldı");

    }

    @Override
    public int yazdirmaSayisiGoster() {
        int sayfaSayisi=5;

        return sayfaSayisi;
    }
}

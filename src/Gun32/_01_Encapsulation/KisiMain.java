package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
        // değişkenlere direk erişimi kapatıp
        // bir metod ile alınan verileri kontrol edip geri gönderir.
        //Encapsulation denir . bilinçli kodlamadır. yav işte küçük harf kullan 25 den fazla olmasın
        Kisi kisi1=new Kisi();
        kisi1.setAd("ismet");
        kisi1.setSoyad("temur");
        kisi1.yasAta(-24);

        System.out.println(kisi1.getAd());
        System.out.println(kisi1.getSoyad());
        System.out.println(kisi1.yasVer());
    }
}

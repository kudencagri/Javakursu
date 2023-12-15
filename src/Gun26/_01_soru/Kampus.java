package Gun26._01_soru;

public class Kampus {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();
        ogr1.ad="Hakan";
        ogr1.soyad="Kılıç";
        ogr1.okulNo=1001;


       //ogr1.ogrOkul=new Okul(); böylede olur
        // yan koda olacak ama

        ogr1.ogrOkul.okulAd="Şehit başkomiser";
        ogr1.ogrOkul.Adres="toplukonut diyarbakır";
        ogr1.ogrOkul.mudurAd="Fatih özdil";




    }
}

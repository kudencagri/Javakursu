package Gun30._01_StaticVariables;

public class Ogrenci {    String ad;
    String soyad;
    static String okulAd="Yıldırım İlkokulu";// nesneye ait değil hepsine 1 kere kullanır
    // kod adı: sen bitanesin
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar.
    // hepsine atanır, tek olarak hafızada bulunur
    //tipin, sınıfın, classın değişkeni oldu

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;// this nesneyi kasteder. değişebiliyor
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "\nad='" + this.ad + '\'' +
                ",\nsoyad='" + this.soyad + '\'' +
                ",\nokulAd='" + okulAd + '\'' +
                '}';
    }
}

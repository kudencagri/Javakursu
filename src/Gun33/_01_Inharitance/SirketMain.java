package Gun33._01_Inharitance;

public class SirketMain {                // personel açtın. ardından yönetici için işlem yapacan. personeldeki tüm veriler yöneticidede olacak ek olarak zamyap eklecenek
                                               // onun için uzun uzun yazma extends Personel yaz aynı alıyor sonra zamyap ekle dava biter.
    public static void main(String[] args) {
        Yeni_yonetici yy=new Yeni_yonetici();
        yy.setAd("ismet");
        yy.zamYap();

        // Kural genel yazılım capsulleme yapılır gerekirse (Private yapılır) kaldırılır.
    }
}

package Gun33._01_Inharitance;

public class Yonetici {
    // personel açtın. ardından yönetici için işlem yapacan. personeldeki tüm veriler yöneticidede olacak ek olarak zamyap eklecenek
    // onun için uzun uzun yazma extends Personel yaz aynı alıyor sonra zamyap ekle dava biter.
    private String ad;
    private String soyad;
    private int yas;
    private double maas;
    private String deparman;
    private int sicilNo;
    private String telefon;
    private String tcNo;
    public  void zamYap(){
        System.out.println("zam yapıldı");
    }
}

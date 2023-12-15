package Gun25._01_;

public class _01_JavaClassAndOOP {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();
        ogr1.adi="Çağrı Canras";
        ogr1.soyadi="Küden";
        ogr1.okulno=1023;
        ogr1.adres="Toplu KOnut/Diyarbakrı";
        ogr1.telefon="05824113163";
        ogr1.sinif=6;
        System.out.println("ogr1.sinif = " + ogr1.sinif);
        System.out.println("ogr1.telefon = " + ogr1.telefon);
        System.out.println("ogr1.okulno = " + ogr1.okulno);
        
        
        
    }
}
class Ogrenci  {
    int okulno;
    String adi;
    String soyadi;
    int sinif;
    String adres;
    String telefon;
    
}
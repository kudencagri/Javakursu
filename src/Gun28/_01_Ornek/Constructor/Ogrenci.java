package Gun28._01_Ornek.Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinif;

    // Yapıcı Metodlar: Constryctor Metodlar
    //public ogrenci normalde istemiyor ama diğerini yapınca boş da olsa istiyor.
    public Ogrenci(){
        System.out.println("nesne olusturuldu");
    }

    // Yapıcı Metodlar: Constryctor Metodlar
    public Ogrenci(int id,String ad,String soyad,int sinif){
        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinif=sinif;
    }
    // Yapıcı Metodlar: Constryctor Metodlar
    public Ogrenci(int id,String ad,String soyad){
        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinif=0;
    }
}

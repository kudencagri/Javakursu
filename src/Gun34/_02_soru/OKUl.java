package Gun34._02_soru;

public class OKUl {
    public static void main(String[] args) {
        Ilkokul ogr1=new Ilkokul("ahmet",Tipi.IlK,"golf");
        LiseOgrencisi ogr2=new LiseOgrencisi("mehmet",Tipi.LISE,"basketbol");
        Ogrenci ogr3=new Ogrenci("yasin",Tipi.ORTA);

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);


    }
}

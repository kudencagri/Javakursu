package Gun28._01_Ornek.Constructor;

import java.util.Arrays;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();

        ogr1.ad="ismet";
        ogr1.soyad="temur";
        ogr1.sinif=4;
        ogr1.id=523;

        System.out.println("ogr1 id = " + ogr1.id);

        Ogrenci ogr2=new Ogrenci(3,"yasin","kök",5);
        System.out.println("ogr2 id= " + ogr2.id);


        Ogrenci ogr3=new Ogrenci(4,"mehmet","kok");
        System.out.println("ogr3.soyad = " + ogr3.soyad);


    }
}

package Gun25._03_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class okul {
    public static void main(String[] args) {
        Scanner okuINt=new Scanner(System.in);
        Scanner okuSTR=new Scanner(System.in);


        ArrayList<Ogrenci> ogrenciler=new ArrayList<>();

        for (int i = 0; i <3 ; i++) {
            Ogrenci ogr=new Ogrenci();

            System.out.print("Öğrenci adı");
            ogr.adi=okuSTR.nextLine();

            System.out.println("öğrenci soyadı");
            ogr.soyadi=okuSTR.nextLine();

            System.out.println("öğrencinin sınıf");
            ogr.Sinif=okuINt.nextInt();

            System.out.println("öğrencinin adresi");
            ogr.Adress=okuSTR.nextLine();

            ogrenciler.add(ogr);
        }
        
        for (Ogrenci o:ogrenciler){
            System.out.println("o.adi = " + o.adi);
            System.out.println("o.soyadi = " + o.soyadi);
            System.out.println("o.Sinif = " + o.Sinif);
            System.out.println("o.Adress = " + o.Adress);
        }






    }
}

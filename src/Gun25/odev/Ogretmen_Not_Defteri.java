package Gun25.odev;

import java.util.ArrayList;
import java.util.Scanner;

public class Ogretmen_Not_Defteri {
    public static void main(String[] args) {
        Scanner OkuInt=new Scanner(System.in);
        Scanner OkuStr=new Scanner(System.in);

        ArrayList<Metod> Not_defteri=new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            Metod ogr=new Metod();

            System.out.println("Öğrencinin Okul No'sunu giriniz");
            ogr.okulNo=OkuInt.nextInt();

            System.out.println("Öğrencinin Tam Adınını giriniz");
            ogr.TamAdi=OkuStr.nextLine();

            System.out.println("Öğrencinin notunu giriniz");
            ogr.notu=OkuInt.nextInt();

            Not_defteri.add(ogr);

        }
        Tum_ogrenciler(Not_defteri);
        Ogrenciler_Ortalama(Not_defteri);
    }
    public static void  Tum_ogrenciler(ArrayList<Metod> Not_defteri){
        for (Metod deger: Not_defteri){

            System.out.println("No="+deger.okulNo+"\t Tam adi="+deger.TamAdi+"\t notu="+deger.notu);
        }
    }
    public static void Ogrenciler_Ortalama(ArrayList<Metod> Not_defteri){
        int toplam=0;
        for (Metod a:Not_defteri){
            toplam=toplam+a.notu;
        }
        System.out.println("Öğrencilerin oratalaması="+(double)toplam/5);
    }
}

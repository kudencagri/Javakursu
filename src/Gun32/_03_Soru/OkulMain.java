package Gun32._03_Soru;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner okulInt=new Scanner(System.in);
        Scanner okulStr=new Scanner(System.in);


        Okul yeniOkul=new Gun32._03_Soru.Okul("Kabatas Okulu",3);

        do {
            System.out.println("Öğrencinin Adı=");String ad=okulStr.nextLine();
            System.out.println("Öğrencinin Soyadı=");String soyad=okulStr.nextLine();
            System.out.println("Öğrencinin yaşı=");int yas= okulInt.nextInt();

            if(yas<15){
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
                yeniOkul.getOgrenciler().add(ogr);

            }else {
                System.out.println("öğrenici yaşı bu okul için uygun değil");
            }



        }while (yeniOkul.getOgrenciler().size()< yeniOkul.getKontejan());
        System.out.println("yeni okul öğrenciler="+yeniOkul.getOgrenciler());

    }
}

package Gun30.soru_02_;

import java.util.Scanner;

public class SoruMain {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        Sabitler bakalim=new Sabitler();

        System.out.println(" gün sayisini giriniz" );
        int gun= oku.nextInt();
        System.out.println(" saat sayisini giriniz" );
        int Saat= oku.nextInt();
        System.out.println(" dakika sayisini giriniz" );
        int dakika= oku.nextInt();


        int ToplamDeger=gun*Sabitler.birgundekiSaatSayisi*Sabitler.saatteki_dakika_sayisi*
                Sabitler.dakikadaki_saniye_sayisi+dakika*Sabitler.saatteki_dakika_sayisi*
                Sabitler.dakikadaki_saniye_sayisi+Saat*Sabitler.dakikadaki_saniye_sayisi;
        System.out.println("ToplamDeger = " + ToplamDeger);


    }
}

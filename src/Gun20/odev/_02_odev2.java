package Gun20.odev;

import java.util.Arrays;
import java.util.Scanner;

public class _02_odev2 {
    public static void main(String[] args) {
        //"OrtaKelime" isminden bir method oluşturun.Bu method String'i parametre olarak almalı.
        // Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.Ortadaki kelimeyi return yapınız
        //Örnek: Ben Java'yı seviyorum.print : Java'yı
        //Örnek2:Java'yı kolayca öğreniyorum.print: kolayca
        Scanner oku=new Scanner(System.in);
        System.out.println("cümleyi giriniz");
        String cumle=oku.nextLine();


        OrtaKelime(cumle);
        System.out.println(OrtaKelime(cumle));

    }
    public static String OrtaKelime(String cumle){
        String[] kelimeler=cumle.split(" ");

        return kelimeler[1];
    }
}

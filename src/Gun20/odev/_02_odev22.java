package Gun20.odev;

import java.util.Scanner;

public class _02_odev22 {
    public static void main(String[] args) {
        //"OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //Ortadaki kelimeyi return yapınız.
        //Örnek: Ben Java'yı seviyorum.
        //print : Java'yı
        //Örnek2:
        //Java'yı kolayca öğreniyorum.
        //print: kolayca

        String yazilan=Ortakelime();
        System.out.println("yazilan = " + yazilan);

    }
    public static String Ortakelime(){
        Scanner oku=new Scanner(System.in);
        System.out.println("cümleyi giriniz" );
        String cumle= oku.nextLine();
        String[] olusum=cumle.split(" ");
        String son=olusum[1];


        return son;
    }
}

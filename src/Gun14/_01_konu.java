package Gun14;

import java.util.Scanner;

public class _01_konu {
    public static void main(String[] args) {

        // kullanıc 0 değerini girene kadar girdiği sayılarıın toplamını bulun

        Scanner oku=new Scanner(System.in);

 //1. yol

        System.out.println("sayiyi giriniz");
        int sayi = oku.nextInt();
        int toplam=0;
        toplam=toplam+sayi;

        while (sayi!=0) { // döngünün dönme şartı girilen sayinin 0 dan farklı olsun
            System.out.println("sayiyi giriniz");
            sayi = oku.nextInt();
            toplam = toplam + sayi;
        }
        System.out.println("toplam="+toplam);
    }
}




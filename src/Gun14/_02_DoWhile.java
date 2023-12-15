package Gun14;

import java.util.Scanner;

public class _02_DoWhile {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        //2. yol

        System.out.println("sayiyi giriniz");
        int sayi = oku.nextInt();
        int toplam=0;
        //toplam=toplam+sayi;// buna gerek kalmadı.

         do { // döngünün dönme şartı girilen sayinin 0 dan farklı olsun
            System.out.println("sayiyi giriniz");
            sayi = oku.nextInt();
            toplam = toplam + sayi;
        }while (sayi!=0);
        System.out.println("toplam="+toplam);

    }
}

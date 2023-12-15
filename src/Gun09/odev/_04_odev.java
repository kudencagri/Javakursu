package Gun09.odev;

import java.util.Scanner;

public class _04_odev {
    public static void main(String[] args) {
        //Kullanıcıdan 2 kere şifresini isteyiniz, aynı ise TAMAM, değil ise HATALI şifre yazınız.
        Scanner oku=new Scanner(System.in);

        System.out.println("şifrenizi giriniz");
        String sifre1=oku.nextLine();
        System.out.println("sifrenizi giriniz");
        String sifre2=oku.nextLine();

        boolean sonuc=sifre1.equals(sifre2);

        if (sonuc==true)
            System.out.println("eşittir");
        else
            System.out.println("degildir");


    }
}

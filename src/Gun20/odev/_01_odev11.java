package Gun20.odev;

import java.util.Scanner;

public class _01_odev11 {
    public static void main(String[] args) {
        //Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.


        randomNum();

    }
    public static void randomNum(){
        Scanner oku=new Scanner(System.in);
        System.out.println("sayiyi giriniz");
        int sayi=oku.nextInt();


        int deger=(int) (Math.random()*(sayi+1));
        System.out.println("deger = " + deger);
    }
}

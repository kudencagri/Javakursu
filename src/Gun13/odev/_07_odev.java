package Gun13.odev;

import java.util.Scanner;

public class _07_odev {
    public static void main(String[] args) {
        //7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.println("3 basamaklı sayiyi giriniz");
        int sayi= oku.nextInt();
        int birler=sayi%10;
        int onlar=((sayi-birler)/10)%10;
        int yuzler=(sayi-onlar*10-birler)/100;


        System.out.println("sayi = " + sayi);
        System.out.println("birler = " + birler);
        System.out.println("onlar = " + onlar);
        System.out.println("yuzler = " + yuzler);



    }
}


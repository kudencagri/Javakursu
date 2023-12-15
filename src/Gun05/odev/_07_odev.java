package Gun05.odev;

import java.util.Scanner;

public class _07_odev {
    public static void main(String[] args) {

        Scanner sayi=new Scanner(System.in);

        System.out.println("1.sayiyi giriniz.");
        int sayi1= sayi.nextInt();
        System.out.println("2.sayiyi giriniz.");
        int sayi2=sayi.nextInt();
        int toplam,carpim,bolme,cikarma;
        toplam=sayi1+sayi2;
        carpim=sayi1*sayi2;
        bolme=sayi1/sayi2;
        cikarma=sayi1-sayi2;
        System.out.println(toplam+" "+carpim+" "+bolme+" "+" "+cikarma);


    }
}

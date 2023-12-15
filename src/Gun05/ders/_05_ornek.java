package Gun05.ders;

import java.util.Scanner;

public class _05_ornek {
    //kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.
    public static void main(String[] args) {
      int toplam;
       Scanner sayi=new Scanner(System.in);

        System.out.println("1.sayı");
       int sayi1= sayi.nextInt();
        System.out.println("2.sayı");
        int sayi2=sayi.nextInt();
        toplam=sayi1+sayi2;
        System.out.println("toplam"+toplam);



    }
}

package Gun13.ders;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        //        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        //        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        //        // işlemi yaptırıp sonucu yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.println("1.sayıyı giriniz");
        int sayi1=oku.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayi2=oku.nextInt();

        System.out.println("Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B");
        String islem= oku.next();
        String yislem=islem.toUpperCase();

        int deger=0;

        switch (yislem){
            case "T" : deger=sayi1+sayi2; System.out.println(deger);break;
            case "P" : deger=sayi1*sayi2; System.out.println(deger);break;
            case "B" : deger=sayi1/sayi2; System.out.println(deger);break;
            case "Ç" : deger=sayi1-sayi2; System.out.println(deger);break;
            default: System.out.println("yanlıs girdiniz");

        }



    }
}

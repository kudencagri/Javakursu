package Gun09.ders;

import java.util.Scanner;

public class _01_soru {
    public static void main(String[] args) {
        // girilen bir sayının tek olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.println("sayıyı giriniz");

        int sayi=oku.nextInt();
        int kalan= sayi%2;
        System.out.println("tekmi"+ (kalan==1) );




    }
}

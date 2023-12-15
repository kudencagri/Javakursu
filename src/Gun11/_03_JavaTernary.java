package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // soru girilen sayı 50 den büyük ise 1 değilse 0 yaz

        Scanner oku=new Scanner(System.in);
        System.out.println("sayıyı giriniz");

        int sayi= oku.nextInt();

        System.out.println((sayi>=50) ? "bir" : "0" );


    }
}

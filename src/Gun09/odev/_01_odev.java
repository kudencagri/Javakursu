package Gun09.odev;

import java.util.Scanner;

public class _01_odev {
    public static void main(String[] args) {
        //1- Girilen bir sayının birler basamağını tek olup olmadığını ekrana yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("sayiyi giriniz");

        int sayi=oku.nextInt();

        if (sayi%2==0)
            System.out.println("sayi çifttir");
        else
            System.out.println("sayi tektir");


    }
}

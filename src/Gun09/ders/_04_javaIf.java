package Gun09.ders;

import java.util.Scanner;

public class _04_javaIf {
    public static void main(String[] args) {
        //girilen iki sayıdan büyük olanın değerini eksana yazdrırnız. eşitsede eşit yazın

        Scanner oku=new Scanner(System.in);

        System.out.println("sayi 1 giriniz");
        int sayi1=oku.nextInt();
        System.out.println("sayi 2 griniz");
        int sayi2= oku.nextInt();

        if (sayi1>sayi2)

            System.out.println("sayi1 büyüktür="+sayi1);
        else if (sayi2>sayi1) {
            System.out.println("sayi2 büyüktür="+sayi2);
        }
        if (sayi1==sayi2)
            System.out.println("sayilar eşittir="+sayi1);
    }
}

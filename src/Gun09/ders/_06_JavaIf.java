package Gun09.ders;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        //girilen öğrencinin notu 50 den büyük eşitse geçtiniz yoksa kaldınız yazsın
        Scanner oku=new Scanner(System.in);
        System.out.println("notu giriniz");

        int sayi=oku.nextInt();

        if (sayi>=50)
            System.out.println("gectiniz");
        else
            System.out.println("kaldınız");



    }
}

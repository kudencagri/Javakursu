package Gun11;

import java.util.Scanner;

public class _08_JavaMath {
    public static void main(String[] args) {
        // girilen 3 sayının büyük olanı yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.println("sayi1");
        int sayi1= oku.nextInt();
        System.out.println("sayi2");
        int sayi2= oku.nextInt();
        System.out.println("sayi3");
        int sayi3= oku.nextInt();

        int deger=Math.max(sayi1,sayi2);
        int sonuc=Math.max(deger,sayi3);
        System.out.println(sonuc);



    }
}

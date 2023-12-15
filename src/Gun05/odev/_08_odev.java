package Gun05.odev;

import java.util.Scanner;

public class _08_odev {
    public static void main(String[] args) {

        Scanner not=new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz.");
        int sayi1=not.nextInt();
        System.out.println("ikinci sayıyı giriniz.");
        int sayi2= not.nextInt();
        System.out.println("ücüncü sayıyı giriniz.");
        int sayi3= not.nextInt();

        int ortalama=(sayi2+sayi1+sayi3)/3;
        System.out.println("ortalama="+ortalama);

    }
}

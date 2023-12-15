package Gun10;

import java.util.Scanner;

public class _01_odev {
    public static void main(String[] args) {
        // // yan yana aralarında bir boslukla girilen 2 int sayının
        //// birbirine eşit olup olmadığını bulunuz
        //// 45 67   gibi
        Scanner oku= new Scanner(System.in);

        System.out.println("sayıyı griiniz");

        String deger= oku.nextLine();
        int bosluk=deger.indexOf(" ");
        String sayi1=deger.substring(0,bosluk);
        String sayi2=deger.substring(bosluk+1);
        int s1=Integer.parseInt(sayi1);
        int s2=Integer.parseInt(sayi2);

        if (s1==s2)
            System.out.println("aynı");
        else
            System.out.println("farklı");




    }
}

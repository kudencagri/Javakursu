package Gun07.odev;

import java.util.Scanner;

public class _15_odev {
    public static void main(String[] args) {
        //Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.println("kelimeyi giriniz.");
        String deger=oku.nextLine();
        boolean sonuc=deger.isEmpty();
        System.out.println(sonuc);




    }
}

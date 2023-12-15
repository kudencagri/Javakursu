package Gun05.ders;

import java.util.Scanner;

public class _02_ornek {
    //girilen adı ekrana yazdırınız
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.print("isim giriniz=");
      String okunanIsım=oku.next(); // next kelime okur.


        System.out.println("biiti"+" "+okunanIsım);
    }
}
/*
okuyucu.next()       > Bir kelime okur
okuyucu.nextline()   >tüm satırı okur
okuyucu.nextInt()    > bir tamsayı(int)okur
okuyucu.nextByte()   > bir tam sayı (Byte)okur
okuyucu.nextDouble() > bir ondalık sayı okur

 */
package Gun05.ders;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        //tipi    adı    başlangıc değeri
           //int    sayi  =5;


              Scanner  okuyucu= new Scanner(System.in);
           //tipi      adı      yeni bir tane okuyucu oluştur(klavyeden-konsoldan)

        System.out.print("sayiyi giriniz=");
        int okunan=okuyucu.nextInt();//rakam girilip entra basıldıgında değeri alı okunan atıyor.

       // okuyucu.nextInt(); //klavyeden girilen tam sayı yı oku
        System.out.println("okunan="+okunan);
        System.out.println("bitti");

    }
}


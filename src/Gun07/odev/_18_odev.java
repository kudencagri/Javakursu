package Gun07.odev;

import java.util.Scanner;

public class _18_odev {
    public static void main(String[] args) {
        //tek seferde girilen 3 kelimelik ismi,        ad , 2.ad ve soyadını     ayrı ayrı yazdırınız.

        //      mesala : Mehmet Alı Yılmaz -> Mehmet  i  Ali  yi ve Yılmaz ı ayrı ayrı yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("ADınızı giriniz.");
        String ad=oku.nextLine();
        int uzunluk=ad.length();
        int bosluk_1=ad.indexOf(" ");
        int bosluk_2=ad.lastIndexOf(" ");
        String ilk_isim=ad.substring(0,bosluk_1);
        String iki_isim=ad.substring(bosluk_1,bosluk_2);
        String uc_isim=ad.substring(bosluk_2);
        System.out.println(ilk_isim);
        System.out.println(iki_isim);
        System.out.println(uc_isim);




    }
}

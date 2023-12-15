package Gun05.ders;

import java.util.Scanner;

public class _04_ornek {
    public static void main(String[] args) {
        // kullanıcıdan adını ve soyadını ayrı ayrı alıp birlikte ekrana yazdırıcaz
        Scanner oku=new Scanner(System.in);

        System.out.print("adınızı giriniz");
        String ad=oku.next();

        System.out.print("soyadını giriniz");
        String soyad=oku.next();

        //**********************************************

        System.out.println("isim soyisim="+ad+soyad);

    }
}

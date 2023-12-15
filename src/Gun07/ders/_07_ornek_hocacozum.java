package Gun07.ders;

import java.util.Scanner;

public class _07_ornek_hocacozum {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.println("adınız ve soy adınız");
        String adsoyad=oku.nextLine();
        // o boşluğun indexine kadar;adı
        // boşluğun indexi +1 den sonunadakar soyad

        int boslukIndex=adsoyad.indexOf(" ");
        String ad= adsoyad.substring(0,boslukIndex);
        String soyad=adsoyad.substring(boslukIndex+1);
        System.out.println(ad);
        System.out.println(soyad);







    }
}

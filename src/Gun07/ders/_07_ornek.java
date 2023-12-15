package Gun07.ders;

import java.util.Scanner;

public class _07_ornek {
    public static void main(String[] args) {
        // tek seferde girilen bir ad soyadın adını ve soyadını ayırıp ayrı ayrı yazdırınız sadece ad ve soyad

        Scanner oku=new Scanner(System.in);

        System.out.println("adınız ve soy adınızı yazın=");
        String adsoyad=oku.nextLine();
        char Ilkharf=adsoyad.charAt(0);
        int boslukIlkharf=adsoyad.indexOf(" ");

        String parca1=adsoyad.substring(0,boslukIlkharf);
        String parca2=adsoyad.substring(boslukIlkharf);
        System.out.println(parca1);
        System.out.print(parca2);




    }
}

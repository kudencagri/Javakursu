package Gun09.ders;

import java.util.Locale;
import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        //girilen cümlede a harfi geçiyorsa evet geçmiyorsa hayır yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("cümleyi yazınız");

        String nam= oku.nextLine();
        String kucuk=nam.toLowerCase(Locale.ROOT);

        boolean varmi=kucuk.contains("a");
        if (varmi==true)
            System.out.println("evet");
        else
            System.out.println("hayır");




    }
}

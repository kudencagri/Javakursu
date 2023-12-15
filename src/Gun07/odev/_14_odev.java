package Gun07.odev;

import java.util.Scanner;

public class _14_odev {
    public static void main(String[] args) {
        //Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.
        Scanner oku=new Scanner(System.in);
        System.out.println("Adınızı giriniz.");
        String ad=oku.nextLine();
        System.out.println("Soyadınızı giriniz.");
        String soyad=oku.nextLine();
        System.out.print("adınız ve soyadınız="+" "+ad+" "+soyad);

    }
}

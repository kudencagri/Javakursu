package Gun07.odev;

import java.util.Scanner;

public class _17_odev {
    public static void main(String[] args) {
        //tek seferde girilen 3 kelimelik ismi,        ad , 2.ad ve soyadını      A.E.Y. şeklinde yazınız.
        //
        //     mesala : Mehmet Alı Yılmaz -> M.A.Y
        Scanner oku=new Scanner(System.in);

        System.out.println("İsminizi giriniz.");
        String name=oku.nextLine();
        char Ilkharf=name.charAt(0);

        int konum_2=name.indexOf(" ");
        char harf_2=name.charAt(konum_2+1);

        int konum_3=name.lastIndexOf(" ");
        char harf_3=name.charAt(konum_3+1);
        System.out.println(Ilkharf+"."+harf_2+"."+harf_3);



    }

}

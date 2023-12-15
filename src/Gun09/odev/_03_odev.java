package Gun09.odev;

import java.util.Scanner;

public class _03_odev {
    public static void main(String[] args) {
        //Girilen bir cümle A harfi ile başlıyorsa , EVET, başlamıyorsa HAYIR yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("cümleyi giriniz");

        String man=oku.nextLine();
        Boolean sonuc=man.startsWith("A");


        if (sonuc==true)
            System.out.println("evet");
        else
            System.out.println("hayır");


    }
}

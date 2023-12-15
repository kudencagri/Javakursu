package Gun06;

import java.util.Scanner;

public class _08_soru {
    public static void main(String[] args) {
        // girilen bir ad soyadı "Ismet Temur" I.T şeklinde yazınız.
        Scanner oku=new Scanner(System.in);

        System.out.println("Adınız ve Soyadınız=");
        String adSoyad=oku.nextLine();

        char Ilkharf=adSoyad.charAt(0);
        int boslukIlkharf=adSoyad.indexOf(" ");
        char soyadilk=adSoyad.charAt(boslukIlkharf+1);
        System.out.println(Ilkharf+"."+soyadilk);


    }
}

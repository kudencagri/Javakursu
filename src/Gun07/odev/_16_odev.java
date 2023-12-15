package Gun07.odev;

import java.util.Scanner;

public class _16_odev {
    public static void main(String[] args) {
        //Girilen bir kelimenin ilk ve son harfini bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.println("kelime giriniz");
        String deger=oku.nextLine();
        int last=deger.length();
        char ilkharf=deger.charAt(0);
        char sonharf=deger.charAt(last-1);
        System.out.println(ilkharf+"  "+sonharf);


    }
}

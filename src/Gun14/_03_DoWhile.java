package Gun14;

import java.util.Scanner;

public class _03_DoWhile {
    public static void main(String[] args) {
        //bullanıcıdan x girilene kadar ekrana " program çalışıyor"  yazan ve x girildiğinde ise " program bitti" yazan programı yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("harf giriiniz");
        String harf=oku.nextLine();
        System.out.println("program calışıyor");

       do {
           System.out.println("harf giriiniz");
           harf=oku.nextLine();
           System.out.println("program calışıyor");

       }while (!harf.equalsIgnoreCase("x"));
        System.out.println("program bitti");
    }
}

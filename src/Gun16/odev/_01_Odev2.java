package Gun16.odev;

import java.util.Scanner;

public class _01_Odev2 {
    public static void main(String[] args) {
        //Kullanıcıdan alarak kelime sayısını yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("cümleyi giriniz");
        String cumle=oku.nextLine();
        String[] parca=cumle.split(" ");
        System.out.println(parca.length);


    }
}

package Gun06;

import java.util.Scanner;

public class _02_ornek {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.println("caddeyi giriniz.");
        String cadde=oku.nextLine();

        System.out.println("sokak adını giriniz");
        String sokak=oku.nextLine();

        System.out.println("ülke adını giriniz");
        String ulke=oku.nextLine();

        Scanner sayi=new Scanner(System.in);

        System.out.println("posta kodunu giriniz");

        int Pkodu=sayi.nextInt();

        Scanner num=new Scanner(System.in);

        System.out.println("ev sahibimisiniz?");
        Boolean asd=num.nextBoolean();

        System.out.println(cadde+sokak+ulke+Pkodu+asd);





    }
}

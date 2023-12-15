package Gun05.ders;

import java.util.Scanner;

public class _06_ornek {
    public static void main(String[] args) {
    //bir karenin kenarını kullanıcıdan isteyip çevresini ve alanınını bunuz.
        Scanner sayi=new Scanner(System.in);
        System.out.print("kenar uzunluğu");
        int kenar= sayi.nextInt();
        int alan,cevre;
        alan=kenar*kenar;
        cevre=4*kenar;
        System.out.println("alanı ve cevresi");
        System.out.println(alan+"     "+cevre);






    }




}

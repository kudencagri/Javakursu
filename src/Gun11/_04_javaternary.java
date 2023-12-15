package Gun11;

import java.util.Scanner;

public class _04_javaternary {
    public static void main(String[] args) {

        // otopark ücretleri 3 saate kadar 10 tl 5 saate kadar 15 tl 5saaten uzunda 20 tl dir.
        // kullanıcı kaç saat oldugunu girsin

        Scanner oku=new Scanner(System.in);

        System.out.println("sayiyi giriniz");
        int sayi=oku.nextInt();
        System.out.println(  (sayi<=3) ? "10 tl" : (sayi<=5) ? "15 tl " : "20 tl "      );




    }
}

package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // girilen bir sayının sıfırmı negatifmi pozitifmi oldugunu  yazdırın
        Scanner oku=new Scanner(System.in);
        System.out.println("sayiyi giriniz");
        int sayi=oku.nextInt();

        System.out.println(   (sayi<0) ? "negatif" : (sayi==0) ? "sıfır" : "pozitif"    );


    }
}

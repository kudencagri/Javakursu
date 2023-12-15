package Gun09.ders;

import java.util.Scanner;

public class _03_javaIf {
    public static void main(String[] args) {
        // girilen sayo negatifmi pozitifmi sıfırmı
        Scanner oku=new Scanner(System.in);
        System.out.println("sayiyi giriniz");
        int sayi=oku.nextInt();

        if (sayi>0)
            System.out.println("sayi pozitif");
        else if (sayi<0) {
            System.out.println("sayi negatiftir");
        }
        if (sayi==0)
            System.out.println("sayi sıfırdır.");

    }
}

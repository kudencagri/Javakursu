package Tekrar;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // girilen cümleyi testen yazınız
        Scanner oku=new Scanner(System.in);
        System.out.println("cümleyi giriniz");
        String cumle=oku.nextLine();

        for (int i = (cumle.length()-1); 0<=i ; i--) {
            System.out.print(cumle.charAt(i));

        }
        // bir cümlede harf kaç kez geçiyor.
        char aranan_harf='a';
        int  tekrarlanma_sayisi=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if (aranan_harf==cumle.charAt(i)){
                tekrarlanma_sayisi++;
            }
        }
        System.out.println();
        System.out.println("tekrarlanma_sayisi = " + tekrarlanma_sayisi);

    }
}

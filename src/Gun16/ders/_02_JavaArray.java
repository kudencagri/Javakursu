package Gun16.ders;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // dizi nasıl okunur ve nasıl yazdırılır?
        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[10];// 10 elemanlı dizi 0-9 tanımlandı.

        for (int i=0 ; i < 10 ; i++ ) {
            System.out.println("sayiyi giriniz=");
            dizi[i]=oku.nextInt();

        }

        for (int i=0 ; i<10 ; i++){

            System.out.println("dizi"+i+" = " + dizi[i]);

        }

    }

}

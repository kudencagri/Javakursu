package Gun18.ders;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int sayi=0; // 1 tane sayi
        int[] dizi=new int[100]; // 100 sayı



        int[] ders1Not=new int[50];//50 kişilik ders1 in notları
        int[] ders2Not=new int[50];//50 kişilik ders2 in notları
        int[] ders3Not=new int[50];//50 kişilik ders3 in notları

        int[][] TumDersNotlari=new int[3][50];// 3 tane 50 lik tablo ayarlıyor

        ders1Not[0]=80;
        TumDersNotlari[0][0]=80;
        System.out.println("TumDersNotlari = " + TumDersNotlari);

        Scanner oku=new Scanner(System.in);
        TumDersNotlari[1][1]=oku.nextInt();
        System.out.println("TumDersNotlari = " + TumDersNotlari[1][1]);



    }
}

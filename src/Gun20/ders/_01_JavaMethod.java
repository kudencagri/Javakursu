package Gun20.ders;

import java.util.Arrays;
import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {
        // kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en büyük,enkücük ve ortalamasını atrı fonklarda bulup yazdırınız.
        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[5];

        for (int i = 0; i < dizi.length ; i++) {
            System.out.println("sayiyi giriniz=");
            dizi[i]= oku.nextInt();

        }

        EnBuyukYaz(dizi);
        EnKucukYaz(dizi);
        OrtalamaYaz(dizi);
    }

    public static void EnBuyukYaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("EnBuyukYaz="+dizi[dizi.length-1]);
    }
    public static void EnKucukYaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("EnkucukYaz="+dizi[0]);
    }
    public static void OrtalamaYaz(int[] dizi){
        int toplam=0;
        int ort=0;
        for (int i = 0; i < dizi.length ; i++) {
            toplam+=dizi[i];
        }
        ort=toplam/ dizi.length;
        System.out.println("ort = " + ort);
    }
}

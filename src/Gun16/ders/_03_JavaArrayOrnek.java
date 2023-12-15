package Gun16.ders;

import java.util.Scanner;

public class _03_JavaArrayOrnek {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük kaç not olduugunu bulunuz
        Scanner oku=new Scanner(System.in);

        int [] dizi=new int[10];
        int toplam=0;
        int ortalama=0;
        int deger=0;
        for (int i=0 ; i < dizi.length ;i++) {
            System.out.println(i+"."+"değeri griiniz");
            dizi[i]=oku.nextInt();
            toplam=toplam+dizi[i];

        }
        ortalama=toplam/ dizi.length;
        for (int i=0 ; i < dizi.length ;i++) {
           if (ortalama<dizi[i]) {
               deger++;

           }
        }
        System.out.println(deger+"  tane değer ortalamanın üstünde" );
        System.out.println("ortalama="+ortalama);
    }
}

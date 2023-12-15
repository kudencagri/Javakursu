package Gun16.ders;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        //kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaçtanesinin ortalamadn büyük ve tek sayı olduğunu bulunuz.
        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[7];
        int toplam=0;
        int deger=0;
        for (int i = 0; i < dizi.length ; i++) {
            System.out.println("değerleri giriniz");
            dizi[i]=oku.nextInt();
            toplam=toplam+dizi[i];
        }
        int ort=toplam/ dizi.length;
        for (int i = 0; i < dizi.length ; i++) {
            if (ort<dizi[i] && dizi[i]%2 == 1 ){
                deger++;
            }
        }
        System.out.println("ortalama="+ort);
        System.out.println("büyük ve tek sayisi="+deger);
    }
}

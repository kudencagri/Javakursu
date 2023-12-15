package Gun13.ders;

import java.util.Scanner;

public class _08_Whileloop {
    public static void main(String[] args) {
        // kullanıcının gireceği 6 sayı sayıdan tek olanların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayac=1;

        while (sayac<=3){
            System.out.println(sayac + ".sayiyi giriniz.");
            int sayi=oku.nextInt();

            if (sayi%2==1) {
                toplam = toplam + sayi;
            }
            sayac++;
        }

        System.out.println("toplam değer"+" "+toplam);

    }
}

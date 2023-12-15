package Gun13.odev;

import java.util.Scanner;

public class _03_odev {
    public static void main(String[] args) {
        //3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        int sayac =0;
        int toplam=0;
        System.out.println("sayinizi giriniz");
        int sayi=oku.nextInt();
        while (sayac<=(sayi-1)){
            sayac++;
            toplam=toplam+sayac;

        }
        System.out.println("toplam="+" "+toplam);


    }
}

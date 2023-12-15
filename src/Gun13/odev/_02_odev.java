package Gun13.odev;

import java.util.Scanner;

public class _02_odev {
    public static void main(String[] args) {
        //Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunu
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayac=1;

        while (sayac<=20){
            System.out.println("sayiyi giriniz");
            int sayi= oku.nextInt();
            if (sayi%2==1){
                toplam=toplam+1;
            }
            sayac++;
        }
        System.out.println("toplam tek sayi sayisi"+" "+toplam);
    }
}

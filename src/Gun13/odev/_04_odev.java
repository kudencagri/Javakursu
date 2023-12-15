package Gun13.odev;

import java.util.Scanner;

public class _04_odev {
    public static void main(String[] args) {
        //Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.
        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;

        while (sayac<=20){
            System.out.println("sayiyi giriniz");
            int sayi=oku.nextInt();
            if (10<sayi){
                if (sayi<30){
                    toplam=toplam+sayi;
                }
            }
            sayac++;
        }
        System.out.println("toplam="+toplam);
    }
}

package Gun13.odev;

import java.util.Scanner;

public class _01_odev {
    public static void main(String[] args) {
        //1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayac=1;

        while (sayac<=20){
            System.out.println("sayiyi giriniz");
            int sayi= oku.nextInt();
            if (sayi%2==1){
                toplam=toplam+sayi;
            }
            sayac++;
        }
        System.out.println("toplam="+" "+toplam);


    }
}

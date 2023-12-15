package Gun13.ders;

import java.util.Scanner;

public class _05_Whileloop {
    public static void main(String[] args) {
         //girilen 20 sayının toplmının sonucunu yazdırınız

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        int sayac=1;
        while (sayac<=5) {
            System.out.println(sayac+".sayiyi giriniz");
            int sayi= oku.nextInt();
            toplam=toplam+sayi;
            sayac++;
        }
        System.out.println("toplam="+toplam);


    }
}

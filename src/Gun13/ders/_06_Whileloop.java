package Gun13.ders;

import java.util.Scanner;

public class _06_Whileloop {
    public static void main(String[] args) {
        // girilen 6 sayıdan sadece pozitif olanları toplayıp sonucu bulun.
        //girilen 20 sayının toplmının sonucunu yazdırınız

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        int sayac=1;
        while (sayac<=6) {
            System.out.println(sayac+".sayiyi giriniz");
            int sayi= oku.nextInt();
            if (sayi>=0) {
                toplam = toplam + sayi;
            }
            sayac++;
        }
        System.out.println("toplam="+toplam);


    }
}

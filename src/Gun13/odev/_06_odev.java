package Gun13.odev;

import java.util.Scanner;

public class _06_odev {
    public static void main(String[] args) {
        // Bir sayı bulmaca oyunu yapılmak isteniyor
        //bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //bilemediniz yazıp tutulan sayıyı bildirsin.
        //Eğer bilirse tebrikler yazsın.
        Scanner oku=new Scanner(System.in);
        double randSayi=Math.random();
        int rand=(int) (randSayi*10+20);
        int sayac=1;
        while (sayac<=3){
            System.out.println(sayac+".tahmin sayinizi giriniz");
            int tahmin=oku.nextInt();
            if (tahmin==rand){
                System.out.println("Tebrikler sayiyi buldunuz."+" "+rand);
            }
            sayac++;
        }
        System.out.println("Bilemediniz,random sayi="+rand);
    }
}

package Gun15;

import java.util.Scanner;

public class _04_continue {
    public static void main(String[] args) {
        // kullanıcıdan 5 sayı isteyiniz.
        // bu sayılardan 6 ile 10 arasındakiler hariç diğerlerini toplasın

        Scanner oku=new Scanner(System.in);
        int toplam=0;

        for(int i = 1; i <= 5 ; i++ ) {

            System.out.println("sayiyi giriniz");
            int sayi= oku.nextInt();
            // if( sayi<6 || sayi > 10) {   // daha kolayı
               // toplam=toplam+sayi;
                //}
            if ( sayi > 6 && sayi <10  ) {
                continue;// pas geç : kendinden sonra gelen komuıtları pas geçer döngüde sonraki adıma geçer
            }
            toplam=toplam+sayi;
        }
        System.out.println(toplam);
    }

}

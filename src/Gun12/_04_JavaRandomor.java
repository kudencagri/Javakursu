package Gun12;

import java.util.Scanner;

public class _04_JavaRandomor {
    public static void main(String[] args) {
        // 20-30 arasında random sayı nasıl üretilir.
        // girilen min max aralığında sayı üreten programı yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("min sayi girin");
        int mins=oku.nextInt();
        System.out.println("max sayiyi girib");
        int maxs=oku.nextInt();

        int randomsayi=(int) (Math.random()*(maxs-mins))  +  mins ;

        System.out.println(randomsayi);
    }
}

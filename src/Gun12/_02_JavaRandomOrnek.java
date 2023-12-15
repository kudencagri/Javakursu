package Gun12;

import java.util.Scanner;

public class _02_JavaRandomOrnek {
    public static void main(String[] args) {
        //girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışırız.
        //kullanıcı bilirse  tebrikler yazdırın.

        Scanner oku=new Scanner(System.in);
        System.out.println("sınır griiniz");
        int sinir=oku.nextInt();

        System.out.println("sayi griiniz");
        int sayi=oku.nextInt();

        double Randomsayi=Math.random();
        int rand= (int) (Randomsayi*10);

        if (rand==sayi);

        System.out.println("Tebrikler");







    }
}

package Gun05.ders;

import java.util.Scanner;

public class _09_ornek {
    // vicud kütle endeksi buş
    // kg/(boy*boy);
    public static void main(String[] args) {


    Scanner deger=new Scanner(System.in);

        System.out.println("boy girin");
        double boy=deger.nextDouble();

        System.out.println("kilo girin");
        double kilo= deger.nextDouble();

        double endeks=kilo/(boy*boy);

        System.out.println("endeks="+endeks);

    }
}

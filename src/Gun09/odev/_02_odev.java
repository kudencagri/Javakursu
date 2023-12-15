package Gun09.odev;

import java.util.Scanner;

public class _02_odev {
    public static void main(String[] args) {
        //2- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bularak,    50 ve yukarısında ise geçtiniz , altında ise kaldınız yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.println("vize notunu giriniz");
        int sayi1=oku.nextInt();
        System.out.println("final notunu giriniz");
        int sayi2=oku.nextInt();
        double deger;
        deger=(sayi1*(0.4)+sayi2*(0.6));
        if (deger>=50)
            System.out.println("gectiniz");
        else
            System.out.println("kaldınız");






    }
}

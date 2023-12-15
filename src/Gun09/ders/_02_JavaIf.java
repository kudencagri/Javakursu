package Gun09.ders;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // baklava dilimimiz; if ///////// den sonra ; olursa if döngüsü okur makine sonra atlar
       // 1-başla   {
        //2-sayi oku; sayi=oku.NextInt()
        //3-sayi>10 ise "10 dan büyük yaz" if (sayi>10)  sout..
        //4-Dur.}
        Scanner oku= new Scanner(System.in);
        System.out.println("sayi=");
        int sayi= oku.nextInt();

        if (sayi>10)
            System.out.println("10dan büyük");
        else
            System.out.println("10dan küçük veya eşit");





    }
}

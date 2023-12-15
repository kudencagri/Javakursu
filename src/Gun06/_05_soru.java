package Gun06;

import java.util.Scanner;

public class _05_soru {
    public static void main(String[] args) {
        //girilen bir stringin sadece son harfini yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("girişi yazdırınız.");

        String cumle=oku.nextLine();

        int uzunluk=cumle.length();

        char sonharf=cumle.charAt(uzunluk-1);

        System.out.println("sonharf="+sonharf);



    }
}

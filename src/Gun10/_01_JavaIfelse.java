package Gun10;

import java.util.Scanner;

public class _01_JavaIfelse {
    public static void main(String[] args) {
        //girilen sayı tekmi çift mi

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayiyi giriniz");

        int deger=oku.nextInt();

        if (deger%2==0)
            System.out.println("sayi çifttir");
        else
            System.out.println("sayi tektir.");



    }
}

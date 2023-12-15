package Gun09.ders;

import java.util.Scanner;

public class _05_javaıf {
    public static void main(String[] args) {
        // girilen bir sayının tekmi çiftmi olduğunu yazın

        Scanner oku=new Scanner(System.in);
        System.out.println("sayıyı giriniz");
        int sayi=oku.nextInt();

        if (sayi%2==0)
            System.out.println("sayi cifttir");
        else
            System.out.println("sayi tektir");
    }
}

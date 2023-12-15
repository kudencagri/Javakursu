package Gun10;

import java.util.Scanner;

public class _02_mantıksalIfadeler {
    public static void main(String[] args) {
        // && >> and işareti
        // || >> or işareti


        Scanner oku=new Scanner(System.in);

        System.out.println("sayi=");
        int sayi= oku.nextInt();
        int kalan=sayi%2;

        if (kalan==1 || kalan==-1) // 1 veya -1 ken
            System.out.println("tek");
        else
            System.out.println("çiftir");




    }
}

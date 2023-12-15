package Gun10;

import java.util.Scanner;

public class _02_odev {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
// toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
// 45 67 123
        Scanner oku=new Scanner(System.in);

        System.out.println("sayıları giriniz");
        String sayi=oku.nextLine();
        int bosluk1=sayi.indexOf(" ");
        int bosluk2=sayi.lastIndexOf(" ");
        String sayi1=sayi.substring(0,bosluk1);
        String sayi2=sayi.substring(bosluk1+1,bosluk2);
        String sayi3=sayi.substring(bosluk2+1);
        int s_1=Integer.parseInt(sayi1);
        int s_2=Integer.parseInt(sayi2);
        int s_3=Integer.parseInt(sayi3);
        int toplam,sonuc;
        toplam=s_3+s_1+s_2;

        sonuc=toplam%2;
        if (sonuc==1)
            System.out.println("sayiların toplamı tektir.");
        else
            System.out.println("sayiların toplamı çifttir");



    }
}

package Gun20.ders;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //kullanıcın gireceği sabir sayıyıya kadar olan sayıların çarpımnını bir fonksiyonda buldurup mainde yazdırınz.
        Scanner oku =new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= oku.nextInt();
        int Fak=0;
        Fak=faktoriyel(sayi);
        System.out.println("Fak = " + Fak);

    }
    public static int faktoriyel(int sayi){
        int Fak=1;
        for (int i = 1; i <= sayi ; i++) {
                Fak = Fak * i;

        }

        return Fak;
    }
}

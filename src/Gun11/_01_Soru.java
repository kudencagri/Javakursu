package Gun11;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // otopark ücreti 3 saate 10 tl 5 saate 15 5 den fazlaysa 20 tl dir kullanıcadan kaç saat kaldıgını alarak ücreti yazdurun

        Scanner oku=new Scanner(System.in);
        System.out.println("kaç saat parkta kaldınız");



       int saat= oku.nextInt();
       if (saat<3)
           System.out.println("10 tl");
       else if ((saat<5) && (3<=saat)) {

           System.out.println("15 tl");

       }
       if (5<=saat)
           System.out.println("20 tl");


    }
}

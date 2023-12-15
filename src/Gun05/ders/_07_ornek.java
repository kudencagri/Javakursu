package Gun05.ders;

import java.util.Scanner;

public class _07_ornek {
    public static void main(String[] args) {
        // dikdörtgenin kenarları al cevre alan?
        Scanner  sayı=new Scanner(System.in);

        System.out.println("1.kenarı yazınız");
        int kenar1=sayı.nextInt();
        System.out.println("2.kenarı yazınız");
        int kenar2=sayı.nextInt();
        int alan=kenar2*kenar1;
        int cevre=2*(kenar1+kenar2);
        System.out.println("cevre="+cevre);
        System.out.println("alan="+alan);



    }

}

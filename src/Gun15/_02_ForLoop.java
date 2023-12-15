package Gun15;

import java.util.Scanner;

public class _02_ForLoop {
    public static void main(String[] args) {
        // Girilen bir sayiyia (dahil) kadar olan sayıların çarpımını bunulunuz
        // çarpım değeri 10000i geçinde durunuz.

        Scanner oku=new Scanner(System.in);
        System.out.println("sayiyi giriniz");

        int sinir=oku.nextInt();

        int carpim=1;

        for (int i = 1 ; i <= sinir ; i++) {
            System.out.println("carpim="+carpim+"*"+i);
            carpim=carpim*i;
            System.out.println(carpim);


            if (carpim>10000) {
                break;
            }
        }
    }
}

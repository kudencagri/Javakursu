package Gun12;

import java.util.Scanner;

public class _IfelseIf_ {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.println("Öğrencinin notunu giriniz");

        int not = oku.nextInt();

        if (not >= 90)
            System.out.println("A");
        else if (not >= 80)
        System.out.println("B");
        else if (not >= 70)
        System.out.println("C");
        else if (not >= 60)
        System.out.println("D");
        else if (not >= 50)
        System.out.println("B");
        else
        System.out.println("B");


    }
}

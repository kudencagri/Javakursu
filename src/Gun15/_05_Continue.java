package Gun15;

import java.util.Scanner;

public class _05_Continue {
    public static void main(String[] args) {
        // girilen bir stringin harflerini teker teker ekrana alt alta olacak şekilde yazınız

        Scanner oku=new Scanner(System.in);
        System.out.println("ifadeyi yazınız");
        String nam= oku.nextLine();
        int Uzun=nam.length();

        for (int i =0 ; i < Uzun ; i++) {

            String harf=nam.substring(i,i+1);
            System.out.println(harf);
            if (harf==" ")
                continue;
        }

    }
}

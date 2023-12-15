package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random (10 dahil sayılarla) doldurduktan sonra kullanıcının gireceği bir rakamı aratınız bu rakam var ise indexi yazdırınz.
        Scanner oku=new Scanner(System.in);

        int[] dizi=new int[10];
        for (int i = 0; i <10 ; i++) {
            dizi[i]=(int)(Math.random()*11);
        }
        System.out.println("aratılacak sayıyı giriniz");
        int ara= oku.nextInt();
        for (int i = 0; i <10 ; i++) {
            if (dizi[i]==ara) {
                System.out.println(Arrays.toString(dizi));
                System.out.println(i+".sırada");
            }

        }

    }
}

package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        // günün sorusu: 3*2 lik bir diziyi kullanıcıdan sayı alarak doldurunuz.sonra tek elemanlarını tek boyutlu bir diziye atayınız.

        Scanner oku=new Scanner(System.in);

        int[][] dizi=new int[3][2];
        int[]  yenidizi=new int[6];


        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                System.out.println("sayiyi girinz");
                dizi[i][j]=oku.nextInt();
            }
        }

        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                if (dizi[i][j]%2==1){
                    yenidizi[i]=dizi[i][j];
                } else {
                    yenidizi[i]=0;
                }
                System.out.print(Arrays.toString(yenidizi));
            }
        }


    }
}

package Gun18.ders;

import java.util.Scanner;

public class _05_soru {
    public static void main(String[] args) {
        //2*3 lük bir tabloyu random 10 a kadar sayılarla doldurunuz.
        // daha sonra kullanıcıdan bir sayı alınız. bu sayı tabloda var ise yerini (i,j) yazdırın.
        Scanner oku=new Scanner(System.in);

        int[][] tablo=new int[2][3];
        int a=0;
        int b=0;
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                tablo[i][j]=(int)(Math.random()*10);
               System.out.print(tablo[i][j]+" ");
            }
           System.out.println();
        }
        System.out.println("sayıyı giriniz");
        int sayi= oku.nextInt();
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (sayi==tablo[i][j]){
                    System.out.println(+i+".satir "+j+".sutun");

                }
            }

        }


    }
}

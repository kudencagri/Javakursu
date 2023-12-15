package Gun18.ders;

import java.util.Arrays;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo= {// 2 satır 3 sutunu temsil eder
                {2,3,44},// 0.satır 3 sutunlu
                {45,66,5}// 1. satır 3 sutunlu


        };
        System.out.println(Arrays.toString(tablo[0]));// 0.satır
        System.out.println(Arrays.toString(tablo[1]));// 1.satır
        System.out.println(tablo[0].length);// 0.satırın uzunluğu
        System.out.println(tablo[1].length);// 1.satırın uzunluğu
        System.out.println("tablo = " + tablo.length);// kaç satır oldugunu
        System.out.println(Arrays.toString(tablo[1]));


    }
}

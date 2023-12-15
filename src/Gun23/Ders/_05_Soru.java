package Gun23.Ders;

import java.util.Arrays;
import java.util.HashSet;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random 10dahil a kadar olan sayılarla doldurduktan sonra tekrarlı değeri olamayacak şekilde bir diziye atınız.

        int[] dizi=new int[10];
        HashSet<Integer> tekrarsiz=new HashSet<>();
        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=(int)(Math.random()*11);
            tekrarsiz.add(dizi[i]);
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        System.out.println("tekrarsiz = " + tekrarsiz);


    }
}

package Gun23.Odev;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_Odev {
    public static void main(String[] args) {
        //Soru5- 2D array[][] oluşturun, 2D array'a girilen elemanları
        //ArrayList'e atıp ve bu ArrayList'i yazdıran programı yazınız.
        //Örnek girdi [[ 1, 2, 3 ],[ 4, 5, 6 ],[ 7, 8, 9 ]]
        //Çıktı: [1,2,3,4,5,6,7,8,9]
        int[][] dizi_1= {{1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 }};
        System.out.println(Arrays.toString(dizi_1));

        ArrayList<Integer> dizi_2=new ArrayList<>();
        for (int i = 0; i <dizi_1.length ; i++) {
            for (int j = 0; j <dizi_1[i].length ; j++) {
                dizi_2.add(dizi_1[i][j]);
            }
        }
        System.out.println(dizi_2);

    }
}

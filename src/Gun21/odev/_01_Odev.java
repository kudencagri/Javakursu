package Gun21.odev;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_Odev {
    public static void main(String[] args) {
        //Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Store all the elements in one arraylist and print the arraylist
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //**Örnek:**
        //**Girdi:**
        // [ 1, 2, 3 ],
        // [ 4, 5, 6 ],
        // [ 7, 8, 9 ]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]
        int[][] degerler={ { 1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 } };
        ArrayList<Integer> yeni_Degerler=new ArrayList<>();

        for (int i = 0; i < degerler.length ; i++) {
            for (int j = 0; j <degerler[i].length ; j++) {
               int k=i+j;
                yeni_Degerler.add(degerler[i][j]);
                System.out.print( degerler[i][j]+" ");
            }
            System.out.print("   ");
        }
        System.out.println();
        System.out.println("yeni_Degerler = " + yeni_Degerler);

    }
}

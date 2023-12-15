package Gun22;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_ArrayList {
    public static void main(String[] args) {
        int sayi=5;// tek bir rakama saklayabilen bir değişken
        int[][] dizi=new int[20][10];// 20 adet sayı saklayabilen bir değişken,
                                     //uzunluk sabit, her bir hücrede bir dizi var
                                     // her satırda 10 tane sayı olan bir dizi var
        
        
        
        ArrayList<Integer> matNotlari=new ArrayList<>();// tekboyut
        ArrayList<Integer> fizNotlari=new ArrayList<>();// tekboyut
        ArrayList<Integer> kimNotlari=new ArrayList<>();// tekboyut
       
        matNotlari.add(50);
        matNotlari.add(60);
        matNotlari.add(70);
        
        fizNotlari.add(50);
        fizNotlari.add(60);
        
        kimNotlari.add(50);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);
        
        // ArrayList lerin Arraylisti
        ArrayList<ArrayList<Integer>> TumNotlar=new ArrayList<>();
        TumNotlar.add(matNotlari);
        TumNotlar.add(fizNotlari);
        TumNotlar.add(kimNotlari);
        
        TumNotlar.get(0);// matNotlarını aliriz.
        TumNotlar.get(0).get(0);//matların 0. sayısını ver
        System.out.println("TumNotlar.get(0) = " + TumNotlar.get(0));// matNotlarını aliriz.
        System.out.println("TumNotlar.get(1) = " + TumNotlar.get(1));// fizNotlarını alırız.
        System.out.println("TumNotlar.get(2) = " + TumNotlar.get(2));// kimNotlarını alırız.

        for (int i = 0; i < TumNotlar.size() ; i++) {
            for (int j = 0; j < TumNotlar.get(i).size() ; j++) {
                System.out.println("TumNotlar = " + TumNotlar.get(i).get(j));
            }
        }
    }
}

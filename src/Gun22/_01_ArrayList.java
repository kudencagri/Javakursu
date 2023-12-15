package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        //array metodları
        // arrayList ->  Collection Metodları

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);
        System.out.println("sayilar = " + sayilar);

        // sıralama
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        // tersine çevirme
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        // Bütün elemanları tek bir değerle set etme
        Collections.fill(sayilar,0);
        System.out.println("sayilar = " + sayilar);

        // Replace 0 değerlerine 5 i ata
        Collections.replaceAll(sayilar,0,5);
        System.out.println("sayilar = " + sayilar);

        // Tanımlarken değer ataması
        int[] dizi={2,3,5,46};
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3,4,5,6,7,8,9,123));
        System.out.println("liste = " + liste);

        //tanımlarken string atanması
        String[] diz={"yasin","ahmet","mehmet"};
        ArrayList<String> listers=new ArrayList<>(Arrays.asList("ahmet","mehmet","rıdvan","mesut") );
        System.out.println("listers = " + listers);
        
        //addAll : bir listeye diğerine  ekleme
        Collections.addAll(sayilar,56,76,89,748,65);
        System.out.println("sayilar = " + sayilar);


    }
}

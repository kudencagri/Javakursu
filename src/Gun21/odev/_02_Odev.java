package Gun21.odev;

import java.util.ArrayList;
import java.util.Collections;

public class _02_Odev {
    public static void main(String[] args) {
        //ismi getCount() olan bir method oluşturun.
        //Parametre olarak bir String ArayList  ve  bir tane String
        //Return tipi int olmalı.
        //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //Örneğin;
        //ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //String Orange:
        //Count = 2 olmalı. (Orange 2 kez yazılmış)

        ArrayList<String> liste = new ArrayList<>();
        Collections.addAll(liste, "Orange", "Kiwi", "Peach", "Banana", "Orange");
        String kelime = "";
        System.out.println("Tekrar Sayısı = " + getCount(liste, kelime));
    }
    public static int getCount(ArrayList<String> list, String kelime)
        {
            int tekrarSayisi = 0;
            for (int i = 0; i < list.size(); i++) {
                for (int k = 0; k < list.size(); k++) {
                    if (list.get(i) == list.get(k) && i != k) {
                        kelime = (String) list.get(i);
                        tekrarSayisi++;
                    }
                }
            }
            System.out.println("Tekrarlanan kelime = " + kelime);
            return tekrarSayisi;
    }
}

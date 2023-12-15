package Gun23.Ders;

import java.util.HashSet;
import java.util.Iterator;

public class _03_ForEach {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");// tekrar değer başarısız.
        renkler.add("RED");
        System.out.println("renkler = " + renkler);

        // ekrana tek tek yazdırır ,dizilerde arraylistlerde her yerde kullanılır.

        for (String eleman: renkler){ // sıra garanti değil
            System.out.println("eleman = " + eleman);

        }
        // foreach
        int[] dizi={34,34,2,23,4,24,1,41,2,23,222};
        for (int eleman:dizi){
            System.out.println("eleman = " + eleman);

        }
        //ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(dizi));
        //for (Integer e:liste){
        //  System.out.println("e = " + e);
        // }



        // Setin kendi sırası nasıl ise onun aynısını verir.
        Iterator gosterge=renkler.iterator();

        while (gosterge.hasNext())
        {
            System.out.println("gosterge.next() = " + gosterge.next());
            // Nex göstergenin gösterdi elemanı temsil eder.
        }

    }
}

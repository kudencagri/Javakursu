package Gun23.Odev;

import java.util.Collections;
import java.util.HashSet;

public class _01_Odev {
    public static void main(String[] args) {
        //Create a method totalCount()
        //totalCount() isminde bir method oluşturun.
        //Parametresi  'Integer Hashset' olmalı
        //HashSetteki eleman sayısını alın.
        //totalCount'u döndürün.
        //_**Örnek:**_
        //hashset ; 4,2,3,1,7
        //cevap: 5

        int deger=0;
        System.out.println(totalCount(deger));

    }
    public static int totalCount(int deger)
    {
        HashSet<Integer> sayi=new HashSet<>();
        Collections.addAll(sayi ,4,2,3,1,7,8);
       deger= sayi.size();

       return deger;

    }

}

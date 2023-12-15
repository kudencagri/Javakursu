package Gun23.Odev;

import java.util.Collections;
import java.util.HashSet;

public class _03_Odev {
    public static void main(String[] args) {
        //commonValues() isminde bir method oluşturun ve parametresi 2 tane "String Hashset"
        //olmalı.return tipi "arraylist" olmalı.
        //Girilen 2 hassetteki aynı elemanlardan oluşan yeni listti yazdıran programı yazınız.
        //Örnek girdi =(1. hasset) "Germany", "England", "South Africa", "Brazil", "USA"
        //(2. hashset) "Germany", "China", "Brazil", "France", "USA"
        //çıktı: "Germany" , "Brazil" ,"USA"

        HashSet<String> hashSet_1=new HashSet<>();
        Collections.addAll(hashSet_1,"Germany", "England", "South Africa", "Brazil", "USA");

        HashSet<String> hashSet_2=new HashSet<>();
        Collections.addAll(hashSet_2,"Germany", "China", "Brazil", "France", "USA" );

        System.out.println(commonValues(hashSet_1,hashSet_2));

    }
    public static HashSet commonValues(HashSet<String> hashSet_1,HashSet<String> hashSet_2){
        HashSet<String> Kesisim=new HashSet<>();
        Kesisim.addAll(hashSet_1);
        Kesisim.retainAll(hashSet_2); //kesişim elemanı al

        return Kesisim;
    }
}

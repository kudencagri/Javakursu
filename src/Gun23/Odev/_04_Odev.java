package Gun23.Odev;

import java.util.Collections;
import java.util.LinkedHashSet;

public class _04_Odev {
    public static void main(String[] args) {
        //Soru4- removing() isminde bir method oluşturun.
        //Parametre olarak bir "LinkedHashset" ve iki "String" olmalı.
        //return tipi "linkedhashset" olmalı
        //Eğer Stringler LinkedHashset 'in içinde varsa, bunları silip kalanları yazdıran programı yazınız.
        //Örnek girdi =linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
        //String1 = Germany
        //String2 = USA
        //Çıktı = France, Canada, Mexico, Brazil
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Germany");
        linkedHashSet.add("France");
        linkedHashSet.add("USA");
        linkedHashSet.add("Canada");
        linkedHashSet.add("Mexico");
        linkedHashSet.add("Brazil");

        String s1="Germany";
        String s2="USA";

        System.out.println(removin(linkedHashSet,s1,s2));

    }
    static public LinkedHashSet<String> removin(LinkedHashSet<String> linkedHashSet,String s1,String s2){
        linkedHashSet.remove(s1);
        linkedHashSet.remove(s2);
        return linkedHashSet;
    }
}

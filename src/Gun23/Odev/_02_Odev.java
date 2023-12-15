package Gun23.Odev;

import java.util.Collections;
import java.util.HashSet;

public class _02_Odev {
    public static void main(String[] args) {
        //changeSet() isminde bir method oluşturun.
        //Parametre olarak bir String HashSet   ve  iki String
        //return hashset olmalı
        //Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        //**ÖRNEK:**
        //hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
        //String 1 = **banana**
        //String 2 = **peach**
        //**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"


        HashSet<String> konu=new HashSet<>();
        Collections.addAll(konu,"banana" , "strawberry" , "kiwi" , "pineapple" );
        String s1="banana";
        String s2="peach";
        System.out.println(changeSet(konu,s1,s2));


    }
    public static HashSet<String> changeSet( HashSet<String> konu,String s1,String s2){

        for (int i = 0; i < konu.size() ; i++) {
            if (konu.contains(s1))
            konu.remove(s1);
            konu.add(s2);
        }

        return konu;
    }
}

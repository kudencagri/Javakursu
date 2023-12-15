package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        //Setlerde 3  Hashset,Linkedhashset,treeset
        //Map--> Hashmap, LinkedHashMap,TreeMap
        //Map-->ANahtar+set> anahtarlı Set tekrar eden anahtarlar yok

        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1001,"İsmet Timur");
        hashMap.put(1002,"Yusuf Yılmaz");
        hashMap.put(2001,"Buğrahan yıldız");
        hashMap.put(5001,"Elife Sözer");

        hashMap.put(1002,"Hatice kök");
        System.out.println(hashMap);

        System.out.println(hashMap.get(2001));
        System.out.println("hashMap.get(5001) = " + hashMap.get(5001));


        System.out.println("hashMap.containsKey(2001) = " + hashMap.containsKey(2001));
        System.out.println("hashMap.containsValue(\"Elife Sözer\") = " + hashMap.containsValue("Elife Sözer"));


        System.out.println(hashMap.keySet());// keyleri toplu verir.
        System.out.println(hashMap.values());// değerleri toplu verir







    }
}

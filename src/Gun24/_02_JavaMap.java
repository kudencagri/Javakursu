package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1001,"İsmet Timur");
        hashMap.put(1002,"Yusuf Yılmaz");
        hashMap.put(2001,"Buğrahan yıldız");
        hashMap.put(5001,"Elife Sözer");
        hashMap.put(1003,"Hatice kök");
        for (Integer k:hashMap.keySet()) {
            System.out.print(k+"\t");
        }
        System.out.println();
        for (String s: hashMap.values()){
            System.out.print(s+"\t");
        }
        System.out.println();

        for (Map.Entry<Integer,String>kv: hashMap.entrySet()) // çıktı almak için Entry içindekileri kasteder.
            System.out.println(kv.getKey()+"-"+kv.getValue());
    }
}

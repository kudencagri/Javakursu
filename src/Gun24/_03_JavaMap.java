package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_JavaMap {
    public static void main(String[] args) {
         Map<Integer,String> hashMap=new HashMap<>();// maplerden hashmap
         hashMap.put(9,"tilki");
         hashMap.put(2,"kedi");
         hashMap.put(30,"köpek");
         hashMap.put(11,"kuş");
         hashMap.put(4,"kurt");
        System.out.println("hashMap = " + hashMap);// hızlı çalışmak için, kendisine göre sıralı


        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(9,"tilki");
        linkedHashMap.put(2,"kedi");
        linkedHashMap.put(30,"köpek");
        linkedHashMap.put(11,"kuş");
        linkedHashMap.put(4,"kurt");
        System.out.println("linkedHashMap = " + linkedHashMap);// ekleme sırasına göre sıralı


        Map<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(9,"tilki");
        treeMap.put(2,"kedi");
        treeMap.put(30,"köpek");
        treeMap.put(11,"kuş");
        treeMap.put(4,"kurt");
        System.out.println("treeMap = " + treeMap);//Herzaman sıralı dendinden şartlı

    }
}

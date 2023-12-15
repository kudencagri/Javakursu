package Gun23.Ders;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(2);
        System.out.println("hs = " + hs);
        hs.remove(1);// değere göre siler
        System.out.println("hs = " + hs);
        if(hs.contains(7))
            System.out.println("var");
        else
            System.out.println("yok");

        hs.clear();
        System.out.println("hs = " + hs);
    }
}

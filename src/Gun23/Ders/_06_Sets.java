package Gun23.Ders;

import java.util.HashSet;

public class _06_Sets {
    public static void main(String[] args) {
        HashSet<Integer> SetA=new HashSet<>();
        SetA.add(2);
        SetA.add(3);
        SetA.add(5);
        SetA.add(4);
        SetA.add(11);

        HashSet<Integer> SetB=new HashSet<>();
        SetB.add(8);
        SetB.add(3);
        SetB.add(5);
        SetB.add(4);
        SetB.add(7);
        SetB.add(6);
        System.out.println("SetA = " + SetA);
        System.out.println("SetB = " + SetB);
        //Birleştirme
        HashSet<Integer> Birlesim=new HashSet<>();
        Birlesim.addAll(SetA);
        Birlesim.addAll(SetB);
        System.out.println("Birlesim = " + Birlesim);
        //Farkı
        HashSet<Integer> Farki=new HashSet<>();
        Farki.addAll(SetA);
        Farki.removeAll(SetB);// A dan B yi çıkar
        System.out.println("Farki = " + Farki);
        //Kesişim
        HashSet<Integer> Kesisim=new HashSet<>();
        Kesisim.addAll(SetA);
        Kesisim.retainAll(SetB); //kesişim elemanı al

        System.out.println("Kesisim = " + Kesisim);


    }
}

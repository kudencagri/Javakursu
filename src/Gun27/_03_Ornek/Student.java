package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    public void DersYazdir(){
        System.out.println("\n *** transkrip ****");
        System.out.println("Sayin= "+name);
        System.out.println("Aldığıgınız dersler Aşağıdadır.");

        for (Lesson d: this.dersleri)
            System.out.println(d.name+" "+d.saat);

    }
    public static void universiteKurallari(){
        System.out.println("kural1");
        System.out.println("Kural2");
        System.out.println("Kural3");
    }
}

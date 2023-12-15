package Gun37._02_Soru;

import java.util.ArrayList;

public class HayvanlarAlemiMain {
    public static void main(String[] args) {
        Duck duck=new Duck("tüketir","diskilar");
        Shark shark=new Shark("tüketir","diskilar");
        Cat cat=new Cat("tüketir","diskilar");
        Swallow swallow=new Swallow("tüketir","diskilar");


        ArrayList<OrtakOz> hayvanlar=new ArrayList<>();

        hayvanlar.add(duck);
        hayvanlar.add(shark);
        hayvanlar.add(cat);
        hayvanlar.add(swallow);

        for (OrtakOz h: hayvanlar){
            System.out.println("**********************");
            System.out.println(h.getClass().getSimpleName());
            System.out.println("**********************");


            if (h instanceof Duck){
                System.out.println(((Duck) h).Swim());
            }
            if (h instanceof Shark){
                System.out.println(((Shark)h).Swim());
            }
            if (h instanceof Cat){
                System.out.println(((Cat)h).sound());
                System.out.println(((Cat)h).Flies());
                System.out.println(((Cat)h).Swim());
            }
            if (h instanceof Swallow){
                System.out.println(((Swallow)h).Migrate());
                System.out.println(((Swallow)h).Flies());
            }
            System.out.println();
            System.out.println();
        }
    }
}

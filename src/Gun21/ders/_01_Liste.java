package Gun21.ders;

import java.util.ArrayList;

public class _01_Liste {
    public static void main(String[] args) {
        // boyutu dinamik olsun eleman ekledikçe uzasın sildikçe kısalsın
        ArrayList<Integer> integerlist= new ArrayList<>();
        ArrayList<String> stringlist=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("ahmet");
        isimler.add("mehmet");
        isimler.add("yasin");
        isimler.add("çağrı");
        isimler.add("canras");
        isimler.add("kuden");

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());
        isimler.add(1,"nurhayat");// araya sokmak
        System.out.println("isimler = " + isimler);
        isimler.set(1,"şerife");// replace yapmak böyle
        System.out.println("isimler = " + isimler);
        boolean Varmi=isimler.contains("çağrı");
        System.out.println("Varmi = " + Varmi);
        isimler.remove("ahmet");//silme sayı versen yada aynı olacak
        System.out.println("isimler = " + isimler);
        isimler.remove(2);
        System.out.println("isimler = " + isimler);
        int indexOfcagri=isimler.indexOf("çağrı");
        System.out.println("indexOfcagri = " + indexOfcagri);
    }}









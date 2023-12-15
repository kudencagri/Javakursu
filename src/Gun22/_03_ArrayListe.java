package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayListe {
    public static void main(String[] args) {
        //sorı
        // notları ekrana ders adlarını bir ArrayListen alarak her desin adını ve notlarını her nir satırda yazdırnız
        //matematik 50 70 88
        // fizik: 30 40

        ArrayList<ArrayList<Integer>> Tum_dersler=new ArrayList<>();
        ArrayList<Integer> matematik=new ArrayList<>();
        ArrayList<Integer> fizik=new ArrayList<>();
        ArrayList<Integer> kimya=new ArrayList<>();
        Tum_dersler.add(matematik);
        Tum_dersler.add(kimya);
        Tum_dersler.add(fizik);
        matematik.add(50);
        matematik.add(60);
        matematik.add(70);
        fizik.add(80);
        fizik.add(90);
        kimya.add(40);
        kimya.add(50);
        kimya.add(75);


        System.out.println("Matematik: "+Tum_dersler.get(0));
        System.out.println("Fizik: "+Tum_dersler.get(1));
        System.out.println("Kimya: "+Tum_dersler.get(2));


        // soru:2
        // kullanıcıdan istediği bir dersin nosunu alarak 0-mat 1-Fiz 2 Kim
        // sadece istediği derse ait notları bir metodda yazdınırız.
        System.out.println("*******************2.soru***********************");
       Scanner oku=new Scanner(System.in);
        System.out.println("DersNo ( 0-Mat, 1-Fiz, 2-Kim ) dersi giriniz");

        int dersNo= oku.nextInt();
        dersNotlariniYazdir(dersNo,Tum_dersler);

    }
    public static void dersNotlariniYazdir(int dersNo,ArrayList<ArrayList<Integer>> Tum_dersler){
        for (int i = 0; i <Tum_dersler.get(dersNo).size() ; i++) {
            System.out.print(Tum_dersler.get(dersNo).get(i)+" ");
        }
    }

}

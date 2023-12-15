package Gun21.odev;

import java.util.ArrayList;
import java.util.Collections;

public class _05_Odev {
    public static void main(String[] args) {
        //"changelnArraylist()" isminde bir method oluşturun.
        //Parametre olarak String ArrayList, String s1, String s2 olmalı
        //Return tipi String arrayList olmalı.
        //Arraylist'te s1'i s2 olarak değiştirin
        //Tüm blue 'ları yellow'a dönüştüren programı yazınız.
        //Örnek girdi= "yellow" , "red" , "blue" , "red" , "blue"
        //s1 = blue
        //s2 = yellow
        //Çıktı= "yellow" , "red" , "yellow" , "red" , "yellow"
        ArrayList<String> deger=new ArrayList<>();
        Collections.addAll(deger,"yellow" , "red" , "blue" , "red" , "blue");
        String s1="blue";
        String s2="yellow";
        System.out.println("Örnek girdi="+deger);
        System.out.print("çıktı=");


        System.out.println(changelnArraylist(deger,s1,s2));


    }
    public static ArrayList<String> changelnArraylist(ArrayList<String> deger,String s1,String s2)
    {
        ArrayList<String> yeniDeger=new ArrayList<>();
        Collections.replaceAll(deger,s1,s2);
        yeniDeger.addAll(deger);



    return  yeniDeger;
    }
}

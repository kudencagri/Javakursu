package Gun21.odev;

import java.util.ArrayList;
import java.util.Collections;

public class _04_Odev {
    public static void main(String[] args) {
        //Soru4-"getLength()" isminde bir method oluşturun.
        //Parametre olarak String ArrayList olmalı
        //Return tipi Integer ArrayList olmalı
        //ArrayList içindeki her bir Stringin uzunluğunu döndüren programı yazınız.
        //Örnek girdi= "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        //Çıktı= 10 , 8 , 4 , 7 , 6 olmalı
        ArrayList<String> liste=new ArrayList<>();
        Collections.addAll(liste,"New jersey" ,"New york" , "Ohio" , "Florida" , "Boston");
        System.out.println(liste);

        getLength(liste);
    }
    public static void getLength(ArrayList<String> liste){
        System.out.print("Çıktı=");
        for (int i = 0; i <liste.size() ; i++) {
            System.out.print(liste.get(i).length()+", ");
        }

    }
}

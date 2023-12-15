package Gun35._03_Soru;

import java.util.Scanner;

public class CozumMain {
    public static void main(String[] args) {
        Ortak ortak=new Ortak("ahmet","nur","boş işler müdürü");

        Scanner oku=new Scanner(System.in);




        Ogrenci ogrenci=new Ogrenci("Mehmet","asd","dolu işler","sayısal");


      Calisan calisan=new Calisan("rıdvan","kök","öylesine işler","matbaa");


        Ortak.KimlikBelgesi(ogrenci);
        Ortak.KimlikBelgesi(calisan);
    }

}

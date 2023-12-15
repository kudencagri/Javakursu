package Gun21.odev;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_odev {
    public static void main(String[] args) {
        //getSum()" isminde bir method oluşturun.
        //Parametresi ArrayList olmalı
        //Return tipi int olmalı.
        //ArrayList teki tüm sayıları birbiri ile toplayan ve toplam sonucu ekrana yazdıran programı
        //yazınız
        //Örnek girdi = 1,2,3,4,5
        //Çıktı=15 olmalı
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(getSum(list));

    }
    public static int getSum(ArrayList<Integer> list){
        Scanner oku=new Scanner(System.in);
        int toplam=0;

        for (int i = 0; i <5 ; i++) {
            System.out.println("sayiyi giriniz");
            int deger=oku.nextInt();
            toplam+=deger;
        }

        return toplam ;
    }
}

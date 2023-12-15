package Gun21.ders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_soru {
    public static void main(String[] args) {
        // kullanıcıdan alacağınız sayılarla doduracağunuz 6 elemanlı sayı bir dizini sadece tek sayı olan elemanlarını ayrı diziyle(arraylist )atayarak yazdırınız.
        Scanner oku=new Scanner(System.in);
        int[] sayi=new int[6];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            System.out.println(" sayıyı giriniz" );
            sayi[i]=oku.nextInt();
            if (sayi[i]%2==1){
                list.add(sayi[i]);
            }
        }
        System.out.println(Arrays.toString(sayi));
        System.out.println("list = " + list);



    }
}

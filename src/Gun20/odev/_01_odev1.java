package Gun20.odev;

import java.util.Scanner;

public class _01_odev1 {
    public static void main(String[] args) {
        //Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.
        Scanner oku=new Scanner(System.in);
        int max=randomNum();
        System.out.println("max = " + max);

    }
    public static int randomNum(){

        int max=((int) (Math.random()*10));

        return max;
    }
}

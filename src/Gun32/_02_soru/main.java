package Gun32._02_soru;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Field araba1=new Field();
        araba1.setRenk("Kirmizi");
        araba1.setModel(2023);
        araba1.setKapisayisi(8);
        araba1.setMotorHacmi(1990);
        System.out.println("araba1 = " + araba1);

        Field araba2=new Field("siyah",2018,5000,3);
        System.out.println("araba2 = " + araba2);



        // Kural genel yazılım kuralıdır bütün değişkenler private yapılır.yani kapsulleme ile kullanılır.
        // eğer gerekiyorsa private kaldırılır.
        // constructurelarda setle atanır.

        Field araba3=new Field("siyah",1018,5000,3);




    }
}

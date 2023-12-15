package Gun16.odev;

public class _03_Odev {
    public static void main(String[] args) {
        //İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.
        //Cevap 220 olmalı.

        int[] Array={25,30,30,35,100};
        int toplam=0;
        for (int i = 0; i <Array.length ; i++) {
            toplam=toplam+Array[i];
        }
        System.out.println(toplam);

    }
}

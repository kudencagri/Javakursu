package Gun20.odev;

public class _03_odev {
    public static void main(String[] args) {
        //"reverseWord" olan bir method oluşturun.
        //Bu method bir String'i parametre olarak almalı.
        //Bu cümledeki kelimeleri tersten yazdıran programı yazınız
        //Örnek girdi: "Java yazın"
        //Çıktı: "yazın Java"
        String cumle="Java yazın";

        reverseword(cumle);

    }
    public static void reverseword(String cumle) {

        String[] dizi=cumle.split(" ");
        for (int i =dizi.length-1; i >=0 ; i--) {
            System.out.print(dizi[i]+" ");

        }

    }
}

package Gun19;

public class _04_JavaMetgod {
    public static void main(String[] args) {// ana metod, diğer metodlardan buranın içinden çağırılack
        int enb=Math.max(5,2); // max metodu değerler almış, geriye büyük olanı vermiş
        double rndsayi=Math.random(); // hiç bir şey almıyor, sadece veriyor.

        System.out.println("Merhaba Dünya"); // veri alıyor, götürüp ekrana yazıyor


        merhabaYaz();// kullanımı kolay, çağırması kolay, tekrar tekrar kullanılabilir.
        merhabaYaz();// mainin daha kolay anlaşılabilir olur.TEMİZ KOD SİSTEMİ
        merhabaYaz();// fonksiyonu çağırma şekli
    }
    public static void merhabaYaz(){

        System.out.println("Merhaba dünya; metotdan");
    }
}

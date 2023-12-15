package Gun02;
// ASCAPE CHARACTERS
public class _02_ornek4 {
    public static void main(String[] args) {

        // \t tab tuşuna bas (2 ,3 harflik boşluk oluşturur)
        // \b back space etkisi oluşturur, yani 1 karegekter geri siler
        // \" tırnak yazdırmak için kullanılır
        // \\ ekrana bir tane \ yazar
        // \r satır başına git


        System.out.println("Merhabadünya"); // Merhabadünya
        System.out.println("Merhaba\ndünya");// merhaba yazar altsatıra geçer dünya yazar
        System.out.println("Merhaba\tdünya");// merhaba   dünya(tab tuşu kadar boşluk olur)
        System.out.println("Merhaba\bdünya");// merhabdünya
        System.out.println("merhaba\"dünya");
        System.out.println("merhaba\\dünya");
        System.out.println("merhaba\rdünya");// merhaba yazar \r yi görünce silerek başa gider en son dünya yazdırır.


    }
}

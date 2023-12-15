package Gun16.odev;

public class _12_Odev {
    public static void main(String[] args) {
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        //Loops (döngüler) kullanın.
        String[] metin={"Apple","Orange","Banana","Pineapple"};

        for (int i = 0; i < metin.length ; i++) {
            Boolean sonuc2=metin[i].equals("Apple");
            System.out.println("sonuc2 = " + sonuc2);
        }


    }
}

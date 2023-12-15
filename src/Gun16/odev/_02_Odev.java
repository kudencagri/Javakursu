package Gun16.odev;

public class _02_Odev {
    public static void main(String[] args) {
        //Bir String oluşturun : "Hello World"
        //Stringi tersten yazdırın ve print edin.
        //_Cevap böyle olmalı :  "dlroW olleH"_

        String str1 = "Hello World";
        for (int i = str1.length()-1; 0 <=i ; i--) {
            System.out.println(str1.charAt(i));
        }
    }
}

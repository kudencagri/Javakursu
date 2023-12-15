package Gun16.odev;

public class _01_Odev {
    public static void main(String[] args) {
        //Bu String'i oluşturun. "Removes white space from both ends of a string"
        //String'deki kelime sayısını yazdırınız.

        String cumle="Removes white space from both ends of a string";
      String[] ParcCum=cumle.split(" ");
     int sayi= ParcCum.length;
        System.out.println("sayi = " + sayi);
    }
}

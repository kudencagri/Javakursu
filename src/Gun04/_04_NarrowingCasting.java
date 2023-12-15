package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {

        int toplam=6700;
        byte sayi= 5 ;

        sayi=(byte) toplam;// veri kaybı olmasa bile dikkali yapılmalı
        System.out.println("sayi="+sayi);




    }
}

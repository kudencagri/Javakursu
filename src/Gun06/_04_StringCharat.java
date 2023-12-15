package Gun06;

public class _04_StringCharat {
    public static void main(String[] args) {

        //istenilen noktadaki karekteri verir.
        String cumle="Merhaba dünya"; // uzunluk=13, 0-12 oda numaraları var index denir.
        System.out.println("uzunluk="+ cumle.length());

        char ilkHarf=cumle.charAt(8);// 0 daki karekteri ver
        System.out.println(ilkHarf);


    }
}

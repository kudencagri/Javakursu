package Gun16.odev;

public class _09_Odev {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
        int[] sayi={15 , 25, 22, 18, 30};
        int EnBuyuk=0;
        int Ikinci=0;
        for (int i = 0; i < sayi.length ; i++) {
            if (EnBuyuk<=sayi[i]) {
                Ikinci=EnBuyuk;
                EnBuyuk=sayi[i];
            }
        }
        System.out.println("Ikinci = " + Ikinci);



    }
}

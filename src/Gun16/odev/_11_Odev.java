package Gun16.odev;

public class _11_Odev {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.
        int[] sayi={12,23,5,15,8};
        int Enbyk=0;

        for (int i = 0; i < sayi.length ; i++) {
            if (Enbyk<=sayi[i]){
                Enbyk=sayi[i];
            }

        }
        System.out.println("Enbyk = " + Enbyk);


    }
}

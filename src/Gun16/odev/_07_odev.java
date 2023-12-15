package Gun16.odev;

public class _07_odev {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.
        int[] sayi={12, 14 , 21 ,23 , 10 ,4};
        int toplam=0;
        int ortalama=0;
        for (int i = 0; i < sayi.length ; i++) {
            toplam=toplam+sayi[i];
        }
        ortalama=toplam/ sayi.length;
        System.out.println("ortalama = " + ortalama);

    }
}

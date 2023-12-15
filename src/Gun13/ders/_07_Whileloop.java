package Gun13.ders;

public class _07_Whileloop {
    public static void main(String[] args) {
        // 1den 100 e kadar sayıların toplamını bulunuz.

        int toplam=0;
        int sayac=1;

        while (sayac<=100){

            toplam=toplam+sayac;
            sayac++;


        }
        System.out.println(toplam);


    }
}

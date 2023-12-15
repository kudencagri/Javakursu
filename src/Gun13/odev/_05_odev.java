package Gun13.odev;

public class _05_odev {
    public static void main(String[] args) {
        //100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.
        int sayac=1;
        int toplam=0;

        while (sayac<=100){
            if (sayac%10==5){
                toplam=toplam+1;
            }
            sayac++;
        }
        System.out.println(toplam);


    }
}

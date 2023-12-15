package Gun14;

public class _05_forLoop {
    public static void main(String[] args) {
        // 0 dan 10 kadar sayiları ekrana yazdırn
        //10 dan 0 kadar sayiları ekrana yazdırn


        int sayac=1;
        for (sayac=1; sayac<=10; sayac++ ) {
            System.out.println(sayac);
        }


        for (int i=10; 0<=i; i-- ){// sayac a cnt yani count kolay olsun diye i
            System.out.println(i);
        }
    }
}

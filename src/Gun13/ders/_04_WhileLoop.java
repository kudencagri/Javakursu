package Gun13.ders;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // ekrana 5 kez merhaba yazdırınız.


        //1.yol
        //System.out.println("merhaba");
        // System.out.println("merhaba");
        //System.out.println("merhaba");
        //System.out.println("merhaba");
        //System.out.println("merhaba");

        //2.yol
        int sayac=1;
        while (sayac<=5) { //iken yap şartı yazıyoruz,dönme şartını
            // tekrarlanacak adımlar buraya yazırılır.

            System.out.println("merhaba");

            sayac++;// sayac=sayac+1, ++sayac

        }
        System.out.println("program bitti");





    }
}

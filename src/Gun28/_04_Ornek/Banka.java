package Gun28._04_Ornek;

public class Banka {
    public static void main(String[] args) {
        Islem islem1=new Islem();
        islem1.adi="is bankası";
        islem1.KurulusYili=1991;
        islem1.SubeSayisi=213;
        Islem islem2=new Islem("cbcn",132,1990);
        Islem islem3=new Islem("vakıfbank",321);


        System.out.println("islem1 = " + islem1);
        System.out.println("islem2 = " + islem2);
        System.out.println("islem3 = " + islem3);


    }
}

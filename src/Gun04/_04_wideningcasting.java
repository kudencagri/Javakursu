package Gun04;

public class _04_wideningcasting {
    public static void main(String[] args) {




    //1.küçük alanı > büyüğe atılabiliyor. (genişleme-widening)
// Byte-> short >int>long > float > double veri kaybı yok pc hata vermez
    int sayi=9;
    long toplam= 6700;
    double oran=3.2;

    oran=sayi; // veri kaybı yok

        System.out.println("oran="+oran );

toplam=sayi;
        System.out.println("toplam="+toplam);

        oran=toplam;
        System.out.println("oran="+oran);



    }


}


package Gun29.Soru;

import java.util.Map;

public class Banka {
    public static void main(String[] args) {
        Musteri mus1=new Musteri();
        mus1.ad="İsmet";
        mus1.soyad="Temur";
        mus1.musteriNo=123123;

        mus1.MusteriHesap.para_Yatir(100);
        mus1.MusteriHesap.para_Yatir(200);
        mus1.MusteriHesap.Cekilen_para(50);
        System.out.println("mus1 = " + mus1.MusteriHesap);

       // mus1.MusteriHesap.bakiye=123123123; // private olduğundan bakiye ye
        //para atılamıyor.



    }


}

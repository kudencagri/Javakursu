package Gun34._03_Protected_konu._02_paket;


import Gun34._03_Protected_konu._01_paket.P1Hayvan;

public class P2Kedi extends P1Hayvan {
    public P2Kedi(String isim,String tur){
        super.ad=isim;// public
        super.cinsi=tur;//protected// defaulttan farkı extend edildiğinde diğer paketlerden de erişile bilir.
    }

}

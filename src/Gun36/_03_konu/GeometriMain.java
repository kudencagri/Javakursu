package Gun36._03_konu;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c=new Cember();
        //c.ciz();// cember çizildi

        Dikdortgen dikdortgen=new Dikdortgen();
        //dikdortgen.ciz();// dikdörtgen çizdirildi

        ICizdirir c2= new Cember();// referans tipi olarak kullanıla bilir
        // interfaceden nesne üretilemez ama polymorphsim olarak kullanıla bilir.

        c2.ciz();// çeber çizildi
        //direk olarak sadece InterFacedeki
        // ismi verilmiş alan

        cizdir(dikdortgen);
        cizdir(c);




    }
    public static void cizdir(ICizdirir g){
        g.ciz();
    }
}

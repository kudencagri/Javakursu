package Gun26._03_soru;

public class Ornek {
    //1-Adım: Rectangle isminde ayrı bir dosyada olmak üzere bir tip tanımlayınız.
    //Özellikleri: width(int), length(int)
    //2-Adım: Çevre bulmak üzere Cevre isminde bir metod yazınız.
    //3-Adım: Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
    //4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.
    public static void main(String[] args) {
        Rectangle deger=new Rectangle();

        deger.lenght=5;
        deger.width=6;

        deger.cevre();
        deger.alan();
    }

}

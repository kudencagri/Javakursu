package Gun33._02_Soru;

public class Kedi extends Hayvan{ // hata vermesinin şartı constructır olmadığından

    public Kedi(String renk, int kilo, String cins) {
        super(renk, kilo, cins);
        // super miras alınan sınıf demek
    }


//    public void konustu(){   sağ tuşla aşağıda
//        System.out.println("Miyavladı");
//    }
    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Miyavladı");
    }
}

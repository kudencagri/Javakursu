package Gun28._05_Ornek;

public class Musteri {
    String name;
    Elektrik_Hesabi elektrikHesabi=new Elektrik_Hesabi();

    public Musteri() {
    }

    public Musteri(String name, Elektrik_Hesabi elektrikHesabi) {
        this.name = name;
        this.elektrikHesabi = elektrikHesabi;
    }
    public Musteri(String name){this.name=name;}
}

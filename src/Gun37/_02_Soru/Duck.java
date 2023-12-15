package Gun37._02_Soru;

public class Duck extends OrtakOz implements ISaling{
    public Duck(String oksijen, String diskilar) {
        super(oksijen, diskilar);
    }

    @Override
    public String Swim() {
        return "çok iyi yüzer";
    }
}

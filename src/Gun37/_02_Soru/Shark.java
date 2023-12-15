package Gun37._02_Soru;

public class Shark extends OrtakOz implements ISaling{
    public Shark(String oksijen, String diskilar) {
        super(oksijen, diskilar);
    }

    @Override
    public String Swim() {
        return "denizlerin en iyi yüzücüsüdür.";
    }
}

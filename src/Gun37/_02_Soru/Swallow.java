package Gun37._02_Soru;

public class Swallow extends OrtakOz implements IFlying{
    public Swallow(String oksijen, String diskilar) {
        super(oksijen, diskilar);
    }

    public String Migrate(){
        return "20 yıl yaşar";
    }


    @Override
    public String Flies() {
        return "Uçan hayvan";
    }
}

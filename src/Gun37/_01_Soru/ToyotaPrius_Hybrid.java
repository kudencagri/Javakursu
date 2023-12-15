package Gun37._01_Soru;

public class ToyotaPrius_Hybrid  extends Vehicle implements IElectric,IGas{
    public ToyotaPrius_Hybrid(Double engine, String model) {
        super(engine, model);
    }

    @Override
    public String chanceBattery() {
        return "Bataryanın 20 yıl ömrü var";
    }

    @Override
    public String ChanceOil() {
        return "bir depoda 300 km gider";
    }

    @Override
    public String drive() {
        return "İlk 3 km elektrikle gider";
    }
}

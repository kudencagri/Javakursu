package Gun37._01_Soru;

public class TeslaCar_Electric extends Vehicle implements IElectric {
    public TeslaCar_Electric(Double engine, String model) {
        super(engine, model);
    }

    @Override
    public String chanceBattery() {
        return "Bataryanın 9 yıl ömrü var";
    }

    @Override
    public String drive() {
        return "Auto Pilot özelliği var";
    }
}

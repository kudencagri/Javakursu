package Gun37._01_Soru;

public class Bus_Deisel extends Vehicle implements IDeisel{

    public Bus_Deisel(Double engine, String model) {
        super(engine, model);
    }

    @Override
    public String ChangeDeisel() {
        return "1 depo ile 1000 km gider";
    }

    @Override
    public String drive() {
        return " en fazla 90 km hız yapabilir." ;
    }
}

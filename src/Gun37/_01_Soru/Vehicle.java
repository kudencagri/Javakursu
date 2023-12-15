package Gun37._01_Soru;

public class Vehicle {
    private Double Engine;
    private String model;

    public Vehicle(Double engine, String model) {
        setEngine(engine);
        setModel(model);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Engine=" + Engine +
                ", model='" + model + '\'' +
                '}';
    }

    public Double getEngine() {
        return Engine;
    }

    public void setEngine(Double engine) {
        Engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

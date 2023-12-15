package Gun38._02_Abstrack;

public class Daire extends Sekil{
    private double yaricap;

    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    double Alan() {
        return 2*Math.PI*(yaricap*yaricap);
    }

    @Override
    double Cevre() {
        return 2*Math.PI*yaricap;
    }
}

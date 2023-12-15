package Gun38._02_Abstrack;

public class Dikdortgen extends Sekil {
    private double kisakenar;
    private double uzunkenar;

    public Dikdortgen(double kisakenar, double uzunkenar) {
        setKisakenar(kisakenar);
        setUzunkenar(uzunkenar);
    }

    public double getKisakenar() {
        return kisakenar;
    }

    public void setKisakenar(double kisakenar) {
        this.kisakenar = kisakenar;
    }

    public double getUzunkenar() {
        return uzunkenar;
    }

    public void setUzunkenar(double uzunkenar) {
        this.uzunkenar = uzunkenar;
    }

    @Override
    double Alan() {
        return this.kisakenar*this.uzunkenar;
    }

    @Override
    double Cevre() {
        return 2*(this.kisakenar+this.uzunkenar);
    }
}

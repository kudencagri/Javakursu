package Gun34._01_soru;

public class Arac {
    private String renk;
    private int MotorHacmi;
    private String Marka;



    public Arac(String renk, int motorHacmi, String marka) {
        setRenk( renk);
        setMotorHacmi(motorHacmi);
        setMarka( marka);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotorHacmi() {
        return MotorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        MotorHacmi = motorHacmi;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", MotorHacmi=" + MotorHacmi +
                ", Marka='" + Marka + '\'' +
                '}';
    }
}

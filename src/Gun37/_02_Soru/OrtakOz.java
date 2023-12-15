package Gun37._02_Soru;

public class OrtakOz {

    private String Oksijen;
    private String Diskilar;

    public OrtakOz(String oksijen, String diskilar) {
        Oksijen = oksijen;
        Diskilar = diskilar;
    }

    @Override
    public String toString() {
        return "OrtakOz{" +
                "Oksijen='" + Oksijen + '\'' +
                ", Diskilar='" + Diskilar + '\'' +
                '}';
    }

    public String getOksijen() {
        return Oksijen;
    }

    public void setOksijen(String oksijen) {
        Oksijen = oksijen;
    }

    public String getDiskilar() {
        return Diskilar;
    }

    public void setDiskilar(String diskilar) {
        Diskilar = diskilar;
    }
}

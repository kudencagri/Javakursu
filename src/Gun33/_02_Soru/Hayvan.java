package Gun33._02_Soru;

public class Hayvan {// super, parent, base
    private String renk;
    private int kilo;
    private String cins;

    public Hayvan(String renk, int kilo, String cins) {
        this.renk = renk;
        this.kilo = kilo;
        this.cins = cins;
    }

    public  void  konustu(){
        System.out.println("ses cıkardı");
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cins='" + cins + '\'' +
                '}';
    }
}

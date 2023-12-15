package Gun33._03_Soru;

public class Calisan {
    private String isim;
    private double maas;
    private double maasKatsayisi;
    private double bodro;


    public double maasHsapla(){
        return this.maas*this.maasKatsayisi;
    }


    public Calisan(String isim, double maas, double maasKatsayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatsayisi(maasKatsayisi);

    }

    @Override
    public String toString() {
        return "Bodro{" +
                "isim='" + this.isim + '\'' +
                ", maas=" + this.maas +
                ", maasKatsayisi=" + this.maasKatsayisi +
                ", ödenecek maaş=" + maasHsapla() +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getMaasKatsayisi() {
        return maasKatsayisi;
    }

    public void setMaasKatsayisi(double maasKatsayisi) {
        this.maasKatsayisi = maasKatsayisi;
    }

    public double getBodro() {
        return bodro;
    }

    public void setBodro(double bodro) {
        this.bodro = bodro;
    }
}


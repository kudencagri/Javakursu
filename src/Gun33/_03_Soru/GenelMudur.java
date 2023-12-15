package Gun33._03_Soru;

public class GenelMudur extends Calisan{

    private double Tazminat;
    public GenelMudur(String isim, double maas, double maasKatsayisi,double tazminat) {
        super(isim, maas, maasKatsayisi);
        getTazminat();
    }

    public String toString() {
        return "Bodro{" +
                "isim='" + super.getIsim() + '\'' +
                ", maas=" + super.getMaas() +
                ", maasKatsayisi=" + super.getMaasKatsayisi() +
                ", ödenecek maaş=" + maasHsapla() +
                " tazminat"+ this.Tazminat+
                '}';
    }

    @Override
    public double maasHsapla() {

        return super.maasHsapla()+getTazminat();
    }

    public double getTazminat() {
        return Tazminat;
    }

    public void setTazminat(double tazminat) {
        Tazminat = tazminat;
    }
}

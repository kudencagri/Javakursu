package Gun39._03_soru_;

public abstract class Hayvan {
    private int id;
    private String isim;
    private Boolean vahsi;
    private String dogumTarihi;

    private static int sayacID=1;

    public Hayvan(String isim, Boolean vahsi, String dogumTarihi) {

       setIsim(isim);
       setVahsi(vahsi);
       setDogumTarihi(dogumTarihi);
        this.id=sayacID++;
    }

    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Boolean getVahsi() {
        return vahsi;
    }

    public void setVahsi(Boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.println("****************");
        System.out.println("ismi = "+ this.isim);
        System.out.print("yiyeceği= "); this.yiyecegi();
        System.out.print("yemek mik= "); this.yemekMiktari();
        System.out.print("uyku süresi= "); this.gunlukUykuSuresi();
        System.out.print("sesi= "); this.sesi();
        return
                "\nid=" + id +
                ",\nisim='" + isim +
                ",\nvahsi=" + vahsi +
                ", \ndogumTarihi='" + dogumTarihi+ "\n\n\n";
    }
}

package Gun38._02_Abstrack;

public abstract class Sekil {
    private String name;
    abstract double Alan();
    abstract double Cevre();
    public  void ciz(){
        System.out.println(name+" Şekli Çizidi");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "\n Name='" + name +
                "\n Alan='" + Alan() +
                "\n Cevre='" + Cevre();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

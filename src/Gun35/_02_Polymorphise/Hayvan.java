package Gun35._02_Polymorphise;

public class Hayvan {
    private String name;

    public Hayvan(String name) {
        this.name = name;

    }
    public  void ses(){
        System.out.println("Ses çıkardı.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "name='" + name + '\'' +
                '}';
    }
}

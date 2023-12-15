package Gun37._02_Soru;

public class Cat extends OrtakOz implements IAnimal{

    public Cat(String oksijen, String diskilar) {
        super(oksijen, diskilar);
    }

    public String sound(){
        return "miyavladı";
    }
    @Override
    public String Food() {
        return "tavuk  yer";
    }

    @Override
    public String Flies() {
        return "uzun zıplar";
    }

    @Override
    public String Swim() {
        return "güzel yüzer";
    }
}

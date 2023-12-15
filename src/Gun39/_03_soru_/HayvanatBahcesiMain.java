package Gun39._03_soru_;

public class HayvanatBahcesiMain {
    public static void main(String[] args) {
        Kartal kartal=new Kartal("sahin göz",true,"07.08.2019");
        System.out.println(kartal.getClass().getSimpleName());
        System.out.println("kartal = " + kartal);

        Kedi kedi=new Kedi("tekir",false,"03.09.2023");
        System.out.println(kedi.getClass().getSimpleName());
        System.out.println("kedi = " + kedi);



    }
}

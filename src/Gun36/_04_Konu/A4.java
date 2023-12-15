package Gun36._04_Konu;

public class A4 implements IYazdiri,IGosterir{
    @Override
    public void goster() {
        System.out.println("Gösterdi");

    }

    @Override
    public void yazdir() {
        System.out.println(" Yazdirdi " );

    }
}

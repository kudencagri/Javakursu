package Gun38._03_Abstrack;

public class MenuMain {
    public static void main(String[] args) {
        SezarSalad sezarSalad=new SezarSalad();
        System.out.println(sezarSalad.getClass().getSimpleName());
        sezarSalad.Taste();
        sezarSalad.MadeIn();


        System.out.println("***********");

        CheeseCake cheeseCake=new CheeseCake();
        System.out.println(cheeseCake.getClass().getSimpleName());
        cheeseCake.MadeIn();
        cheeseCake.Taste();

        System.out.println("***********");
        Baklava baklava=new Baklava();
        System.out.println(cheeseCake.getClass().getSimpleName());
        baklava.MadeIn();
        baklava.Taste();

        System.out.println("****************");
        GreekSalad greekSalad=new GreekSalad();
        System.out.println(greekSalad.getClass().getSimpleName());
        greekSalad.MadeIn();
        greekSalad.Taste();

    }
}

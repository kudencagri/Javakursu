package Gun38._02_Abstrack;

public class IslemMain {
    public static void main(String[] args) {

        Daire yaricap=new Daire(6);
        yaricap.setName("yeni Daire");
        yaricap.ciz();


        System.out.println(yaricap);


        System.out.println("-------------------------");

        Dikdortgen dikdortgen=new Dikdortgen(5,7);
        dikdortgen.setName("Yeni Dikdörtgen");
        dikdortgen.ciz();
        System.out.println(dikdortgen);


    }
}

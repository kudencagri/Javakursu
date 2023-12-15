package Gun12;

public class _01_JavaRandom {
    public static void main(String[] args) {

        double randsayi=Math.random(); // 0-0.999999999  random hersaman double üretir.
        System.out.println(randsayi);
        int rndTamsayi=(int)(randsayi*10);// 10 la çarparsan 0-9 arası verir
        System.out.println(rndTamsayi);

    }
}

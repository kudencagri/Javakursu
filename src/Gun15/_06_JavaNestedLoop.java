package Gun15;

public class _06_JavaNestedLoop {
    public static void main(String[] args) {
        // çarpım tablosunda 2 lerden başla 5 lere kadar devam et
        // 2 x 1 = 2
        // 2 x 2 = 4
        int carpim = 1 ;

        for (int baslangic = 1; baslangic <= 5 ; baslangic++) {

            for (int i = 1; i <= 10; i++) {
                carpim = baslangic * i;
                System.out.println(baslangic + "x" + i + "=" + carpim);
            }
            System.out.println("************************");
        }







    }
}

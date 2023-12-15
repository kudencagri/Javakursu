package Gun20.ders;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int s1=5;
        int s2=4;

        double d1=1.2;
        double d2=3.2;


        int sonuc1=toplam(s1,s2);
        double sonuc2=toplam(d1,d2);
        // metodlara aynı isim verilebilir, yeterki parametreden ayırt edilebilsin

    }
    public static int toplam(int s1,int s2){
        return s1+s2;
    }
    public  static double toplam(double s1 ,double s2){
        return s1+s2;
    }
}

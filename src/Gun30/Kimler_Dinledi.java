package Gun30;

public class Kimler_Dinledi {
    int a;
    static int b=0;
    void  artir(){
        a++;
        b++;
    }

    public static void main(String[] args) {
        Kimler_Dinledi kd1=new Kimler_Dinledi();
        kd1.a=5;
        Kimler_Dinledi kd2=new Kimler_Dinledi();
        kd2.a=7;
        // 1. soru anın değeri şuanda kaçtır.
        // burada her nesnenin a sı var kd1 5 kd2 7 değere,

        System.out.println("kd1.a = " + kd1.a);
        System.out.println("kd2.a = " + kd2.a);
        // 2. soru b nin değeri kaçtır.
        kd1.artir();// kd1.a -> 6 b ->1
        kd2.artir();// kd2.a -> 8 b ->2

        System.out.println("kd1.a = " + kd1.a);
        System.out.println("kd2.a = " + kd2.a);
        System.out.println("b = " + b);
    }
}

package Gun11;

public class _07_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b=4;
        System.out.println("anın mutlak değeri="+ Math.abs(a));
        System.out.println("a ve b den büyük olanı ver=" + Math.max(a,b));
        System.out.println("a ve b den küçük olanı ver=" + Math.min(a,b));
        System.out.println("2^3=" + Math.pow(2,3));
        System.out.println("b nin karekökü=" + Math.sqrt(b));
        System.out.println("round(yuvarlama) 3.1" + Math.round(3.1));

        System.out.println("ceil 3.1  ="+ Math.ceil(3.1)); // 4 bu rakamdan büyük en yakın tam sayı
        System.out.println("ceil 3.9  ="+ Math.ceil(3.9)); // 4 bu rakamdan büyük en yakın tam sayı
        System.out.println("floor 3.1  ="+ Math.floor(3.1)); // 3 bu rakamdan küçük en yakın tam sayı
        System.out.println("floor 3.9  ="+ Math.floor(3.9)); // 3 bu rakamdan küçük en yakın tam sayı



    }
}

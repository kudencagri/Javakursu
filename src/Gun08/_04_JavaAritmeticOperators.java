package Gun08;

public class _04_JavaAritmeticOperators {
    public static void main(String[] args) {
        int a=9;
        int b=5;

        System.out.println("toplama işlemi");
        System.out.println((a+b));

        System.out.println("cıkarma işlemi");
        System.out.println((a-b));

        System.out.println("Çarpma işlemi");
        System.out.println((a*b));

        System.out.println("bölme işlemi");
        System.out.println((a/b));// normal sonu. 1.8 , fakat pc 2 side tam sayı ise , küsüratı atar.çünkü int/int
        // küsüratlı sonuç istiyorsan işleme girenlerden en az 1 isi double olmalı.

        System.out.println("bölme işlemi");
        System.out.println(((double) a/b));
        //****************************************************
        System.out.println("modül işlemi ; bölümünden kalan demek");
        System.out.println("a%b="+(a%b));



























    }





















}



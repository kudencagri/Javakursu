package Gun17;

import java.util.Arrays;

public class _04_JavaArrayMethodlari {
    public static void main(String[] args) {
        
        String[] isimler={"Ahmet","Zeynep","Roman","Kaya","Cihan"};
        //diziyi direk ekrana yazdırmak için.
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));

        int[] a={1,2,3,54,13,32,2};
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));


        Arrays.sort(isimler);// dizileri sıralama harfleri harfe göre sayılara göre siralar
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));
        // diziler eşitmi
        int[] b={1,8,3,54};
        int[] c={1,3,8,54};
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));
        System.out.println("Arrays.equals() = " + Arrays.equals(b,c));
        // contains gibi çalışır. var ise pozitif sayı verir ,yoksa negatif sayı
        //sadece sıralı dizilerde çalışır.

        System.out.println("Arrays.binarySearch(c,3) = " + Arrays.binarySearch(b, 3));
        // diziyi hızlıca doldurmak bir değer ile
        Arrays.fill(a,5);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));


        
        
    }
}

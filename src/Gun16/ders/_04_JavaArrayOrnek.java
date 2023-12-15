package Gun16.ders;

public class _04_JavaArrayOrnek {
    public static void main(String[] args) {
        int[] dizi=new int[5];// 0,1,2,3,4  indexli 5 elamanlı dizi, int sayi;
        int[] dizi2={3,6,44,55,77};// 5 elamanlı dizi hem tanımlandı hemde değer atandı, int sayi=5;

        String[] cumleler=new String[5];// 5 tane cumle saklayabilen bir String dizi değişkeni;
        Boolean[] dizi3=new Boolean[5]; // 5 tane (true/false) saklayabilen bir dizi değişkeni;
        Double[]  oranlar=new Double[5];// 5 tane dobule saklayabilen bir dizi değişkeni;
        for (int i = 0; i < 5; i++) {
            System.out.println("dizi3[i] = " + dizi3[i]);

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("dizi[i] = " + dizi[i]);

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(" dizi2[i] = " + dizi2[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("cumleler = " + cumleler[i]);

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("oranlar = " +oranlar[i]);

        }

    }
}

package Gun16.odev;

public class _08_Odev {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //**Örneğin:**
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //Toplamlarını yazdırın.
        int[] sayi={5,6,8,12,14,19};
        int cift=0;
        int tek=0;
        for (int i = 0; i < sayi.length ; i++) {
            if (sayi[i]%2==0){
                cift=cift+sayi[i];
            } else {
                tek=tek+sayi[i];
            }
        }
        int sonuc=cift-tek;
        System.out.println("sonuc = " + sonuc);


    }
}

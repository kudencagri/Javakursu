package Gun20.ders;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1=45; // metod parantez içi int ... string ... falan diyince hangi girdi olursa kaçtaneyse ona göre işlem yapar.
        int s2=4;
        int s3=65;
        int s4=72;

        int sonuc1=toplamBul(s1,s2);
        int sonuc2=toplamBul(s1,s2,s3);
        int sonuc3=toplamBul(s1,s2,s3,s4);
        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }
    public static int toplamBul(int... dizi){
        int toplam=0;
        for (int i = 0; i < dizi.length ; i++) {
            toplam=toplam+dizi[i];
        }
        return toplam;
    }
}

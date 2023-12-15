package Gun20.ders;

public class _02_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        MerhabaYaz();// giden yok, dönen yok
        toplamYaz(4,5);//giden var,dönen yok
        int enb=Math.max(4,5);// giden var ,dönen var(eşitlenebiliyorsak dönen var)
        double rndSayi=Math.random();// giden yok dönen var(eşitlenebiliyorsa dönen var)
        /***************************/
        enbBulYaz(4,5);
        enb=enbBulGeriGonder(4,5);
        System.out.println("enb = " + enb);
        // javaya ait herhangi bir metodun üzerine ctrl ile tıkladığınızda, metodu iöeren kodlarını göre bilirz


    }
    public static int enbBulGeriGonder(int s1,int s2){
        //void tipsiz demek , yani return yok
        int enb=0;
        if (s1>s2)
            enb=s1;
        else
            enb=s2;
        return enb;// dönecek elemanın tipini metodun adından önce  yazıyoruz.

    }
    public static void enbBulYaz(int s1,int s2){ // sırasıyla eşleşiyor.
        if (s1>s2)
            System.out.println(s1);
        else
            System.out.println(s2);

    }
    public static void MerhabaYaz(){
        System.out.println("merhaba yaz");

    }
    public static void toplamYaz(int s1,int s2){
        int toplam=s1+s2;
        System.out.println(toplam);

    }}

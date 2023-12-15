package Gun31._03_;

public class AylarMain {
    public static void main(String[] args) {

        Aylar ay=Aylar.ARALIK;
        System.out.println("ay = " + ay);
        System.out.println("ay.Ayno = " + ay.Ayno);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.AyAd = " + ay.AyAd);

        for (Aylar a:Aylar.values())
            System.out.println(a.Ayno+" "+a.gunMiktar+" "+a.AyAd);
    }
}

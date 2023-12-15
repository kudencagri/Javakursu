package Gun31._03_;

public enum Aylar {
    Tanimsiz(0,0,""),
    OCAK(1,31,"Ocak"),
    SUBAT(2,28,"Şubat"),

    MART(3,31,"Mart"),
    NISAN(4,30,"Nisan"),
    MAYIS(5,31,"Mayıs"),
    HAZIRAN(6,30,"Haziran"),
    TEMMUZ(7,31,"Temmuz"),
    OGUSTOS(8,31,"Ağustos"),
    EYLUL(9,30,"Eylül"),
    EKIM(10,31,"Ekim"),
    KASIM(11,30,"Kasım"),
    ARALIK(12,31,"Aralık");
    final int Ayno;
    final int gunMiktar;
    final String AyAd;


    Aylar(int Ayno, int gunMiktar,String AyAd) {
        this.Ayno=Ayno;
        this.gunMiktar=gunMiktar;
        this.AyAd=AyAd;
    }
}

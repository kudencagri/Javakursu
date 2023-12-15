package Gun31._01_Enum;

public class Enum {// enum enum   okunabilirlik ve kontrollü yazılım yok yanımlama yetersizoldugu durumlarda
    // numara yerine tanımlama yapılır bireysel hatalardan ve zorluklardan kaçınılır.
    // Enumaration : numaralandırlmış simgeler
    // class ın içinde enum tanımlana bilir ama mainde olmaz
    enum Aylar {
        Tanimsiz,OCAK,SUBAT,MART,NISAN,MAYIS,HAZIRAN,
        TEMMUZ,OGUSTOS,EYLUL,EKIM,KASIM,ARALIK
    }

    public static void main(String[] args) {
        Aylar ay=Aylar.MAYIS;

        switch (ay){
            case EKIM:
                System.out.println(28);break;
            case MART:
            case MAYIS:
            case OCAK:
            case TEMMUZ:
            case EYLUL:
            case KASIM:
            case ARALIK:
            case SUBAT:
            case OGUSTOS:
            case NISAN:
            case HAZIRAN:
        }
        if (ay==Aylar.MAYIS)
            System.out.println("zam ayı");
        System.out.println("ay = " + ay);// toString Simge MAYIS
        System.out.println("ay.name() = " + ay.name());// Simge Mayıs
        System.out.println("ay.ordinal() = " + ay.ordinal());// Sİmgenin indexi 5

        for (Aylar a:Aylar.values())
            System.out.println( a.name() +" "+ a.ordinal());
    }
}

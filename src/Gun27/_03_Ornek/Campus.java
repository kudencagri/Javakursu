package Gun27._03_Ornek;

public class Campus {
    public static void main(String[] args) {

        Student.universiteKurallari();
        Lesson ders1=new Lesson();
        Lesson ders2=new Lesson();
        Lesson ders3=new Lesson();

        ders1.name="Algoritma";
        ders1.saat=6;
        ders2.name="Java";
        ders2.saat=6;
        ders1.name="Testtool";
        ders1.saat=8;

        Student ogr1=new Student();
        ogr1.name="Korhan";
        ogr1.maxSaat=20;

        ogr1.dersleri.add(ders1);
        ogr1.dersleri.add(ders2);
        ogr1.dersleri.add(ders3);

        ogr1.DersYazdir();



    }
}

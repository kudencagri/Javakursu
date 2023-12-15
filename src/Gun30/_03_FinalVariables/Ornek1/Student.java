package Gun30._03_FinalVariables.Ornek1;

public class Student {
    final int id; // nesne
    // değiştirilemez
    //yani sadece 1 kez veri atama şansı var
    String fullname; //nesneye

    private static int sayac=1; // kime ait:class


    public Student(int id, String fullname) {
        this.id = id;
        // final değişkenlerine sadece 1 kez veri atana bilir
        // o da ya tanımlanırken, yada Constructorda
        this.fullname = fullname;
    }

    public Student(String fullname) {
        this.fullname = fullname;
        this.id=sayac++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}

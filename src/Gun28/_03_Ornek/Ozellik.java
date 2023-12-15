package Gun28._03_Ornek;

public class Ozellik {
    String name;
    int PublishYear;
    String author;

    public Ozellik() {
    }

    public Ozellik(String name, int publishYear, String author) {
        this.name = name;
        PublishYear = publishYear;
        this.author = author;
    }

    public Ozellik(String name, int publishYear) {
        this.name = name;
        PublishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Ozellik{" +
                "name='" + name + '\'' +
                ", PublishYear=" + PublishYear +
                ", author='" + author + '\'' +
                '}';
    }
}

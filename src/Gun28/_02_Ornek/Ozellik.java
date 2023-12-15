package Gun28._02_Ornek;

public class Ozellik {
    String name;
    int PublishYear;
    String author;

    public Ozellik(){

    }
    public Ozellik(String name,int Publishyear,String author){
        this.name=name;
        this.PublishYear=Publishyear;
        this.author=author;
    }
    public Ozellik(String name,int publishYear){
        this(name,publishYear,"");
    }
    public String toString() {
        return this.name+" "+this.author+" "+this.PublishYear+" ";
    }

}

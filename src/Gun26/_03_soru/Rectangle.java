package Gun26._03_soru;

public class Rectangle {
    int lenght;
    int width;

    public void cevre(){
        int cevre=((this.lenght*this.width)*2);
        System.out.println("cevre = " + cevre);

    }
    public void  alan(){
        int alan=(this.lenght*this.width);
        System.out.println("alan = " + alan);
    }

}

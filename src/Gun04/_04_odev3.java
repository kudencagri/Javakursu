package Gun04;

public class _04_odev3 {
    public static void main(String[] args) {

        String taksit1="150";
        String taksit2="185";
        String taksit3="83";

        double ctaksit1=Double.parseDouble(taksit1);
        double ctaksit2=Double.parseDouble(taksit2);
        double ctaksit3=Double.parseDouble(taksit3);

        double toplam,ortalama;
        toplam=ctaksit1+ctaksit2+ctaksit3;
        ortalama=toplam/3;
        System.out.println("toplam="+toplam);
        System.out.println("ortalama="+ortalama);



    }
}

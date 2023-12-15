package Gun04;

public class _04_ornek3 {
    public static void main(String[] args) {
        //string olarak verilen 3 notun(80 95 56 ) ortalamasını bulunuz.
        String not1="82";
        String not2="95";
        String not3="56";

        double notchance1=Double.parseDouble(not1);
        double notchance2=Double.parseDouble(not2);
        double notchance3=Double.parseDouble(not3);
        double ortalama=0;
        ortalama=(notchance3+notchance1+notchance2)/3;
        System.out.println("ortalama="+ortalama);






    }
}

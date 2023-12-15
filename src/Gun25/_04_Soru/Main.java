package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        int toplam=0;

        ArrayList<Araba> katalog=new ArrayList<>();

        for (int i = 0; i <3 ; i++) {
            Araba arababa=new Araba();
            System.out.println("arabaNı giriniz");
            arababa.arabaNi=okuInt.nextInt();

            System.out.println("araba markası");
            arababa.marka=okuStr.nextLine();

            System.out.println("araba üretim yılı");
            arababa.uretimyili=okuInt.nextInt();

            toplam=toplam+ arababa.arabaNi;

            katalog.add(arababa);
        }
        int ort=toplam/3;

        for (Araba a:katalog){
            System.out.println(a.arabaNi);
            System.out.println(a.marka);
            System.out.println(a.uretimyili);

        }
        System.out.println(ort);




    }


}

package Gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // kullanıcın girdiği gün numarasına karşıluk gelen günü yazınız

        Scanner oku=new Scanner(System.in);
        System.out.println("gün no");
        int no=oku.nextInt();

        switch (no){

            case 1 : System.out.println("Pazartesi"); break;// break olmasa hepsini yazıyor
            case 2 : System.out.println("salı"); break;
            case 3 : System.out.println("çarsamba"); break;
            case 4 : System.out.println("perşembe"); break;
            case 5 : System.out.println("cuma"); break;
            case 6 : System.out.println("cumartesi"); break;
            case 7 : System.out.println("pazar"); break;
            default: System.out.println("hatalı giriş");



        }


    }
}

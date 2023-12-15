package Gun05.ders;

import java.util.Scanner;

public class _03_ornek {
    //kullanıcı adını soyadını alarak ekrana yazdırınız.
    public static void main(String[] args) {
        Scanner adiniz_soyadiniz=new Scanner(System.in);
        System.out.print("isim soyisim");
        String okunan=adiniz_soyadiniz.nextLine();
        System.out.println("isim soyisim="+okunan);

    }
}

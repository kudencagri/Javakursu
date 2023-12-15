package Gun10;

import java.util.Locale;
import java.util.Scanner;

public class _04_Ifelse {
    public static void main(String[] args) {
        // girilen kurallar
        /*
        1) en az 8 karekter
        2)içinde pass kelimaesı olmamlı
        3)enfazla 12 karekter
         */
        Scanner oku=new Scanner(System.in);
        System.out.println("şifreyi giriniz");
        String metin=oku.nextLine();
        String olusum=metin.toLowerCase(Locale.ROOT);
        int uzun=olusum.length();
        boolean olun=olusum.contains("pass");
        if ((olun==false) && (uzun<=12) && (8<=uzun) )
            System.out.println("geçerli");
        else
            System.out.println("geçersiz");







    }
}

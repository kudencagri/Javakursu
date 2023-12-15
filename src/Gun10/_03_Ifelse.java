package Gun10;

import java.util.Scanner;

public class _03_Ifelse {
    public static void main(String[] args) {
        // girilen bir stringin uzunluğu 10dan büyükse ve string içinde study kelimesi geçiyorsa evet geçmiyorsa hayır yazdırın.

        Scanner oku=new Scanner(System.in);

        System.out.println("string girin");
        String cumle=oku.nextLine();
        int deger=cumle.length();
        Boolean net=cumle.contains("study");
        if ((deger>10) && (net==true))
            System.out.println("Evet");
        else
            System.out.println("hayır");


    }
}

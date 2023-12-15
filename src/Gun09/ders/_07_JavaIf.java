package Gun09.ders;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        //girilen cümlede a harfi geçiyorsa evet geçmiyorsa hayır yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("cümleyi yazınız");

        String nam= oku.nextLine();
        boolean varmi=nam.contains("a");
        if (varmi==true)
            System.out.println("evet");
        else
            System.out.println("hayır");


    }
}

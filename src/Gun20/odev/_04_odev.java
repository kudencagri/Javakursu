package Gun20.odev;

import java.util.Scanner;

public class _04_odev {
    public static void main(String[] args) {
        //Soru5- Girilen bir diziyi tersten yazdıran programı yazınız.
        //Örnek girdi:"m","a","l","e","s"
        //Çıktı: "selam"
        Scanner oku=new Scanner(System.in);
        System.out.println("cümleyi griniz");
        String cumle=oku.nextLine();
        tersgirdi(cumle);
    }
    public static void tersgirdi(String cumle){
        for (int i = cumle.length()-1; i >=0 ; i--) {
            System.out.print(cumle.charAt(i)+" ");
        }
    }
}

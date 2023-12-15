package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cümlede kaç kelime olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cumle=oku.nextLine();
        int boslukSayi=0;
        for (int i = 0; i <cumle.length() ; i++) {

           if(cumle.charAt(i)== ' ' ){
               boslukSayi++;

           }
        }
        System.out.println("boslukSayi = " + (boslukSayi+1));

    }
}

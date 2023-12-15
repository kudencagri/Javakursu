package Gun20.odev;

import java.util.Scanner;

public class _03_odev33 {
    public static void main(String[] args) {
      //adı  reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //Örnek 1 :
        //Dize: Java yazın
        //dönüş şöyle olmalıdır:  yazın Java


        reverseWord();
    }
    public static void reverseWord(){
        Scanner oku=new Scanner(System.in);
        System.out.println("cümleyi giriniz");
        String cumle=oku.nextLine();

        String[] last=cumle.split(" ");
        for (int i = last.length-1; 0 <= i ; i--) {
            System.out.print(last[i]+" ");
        }
    }
}

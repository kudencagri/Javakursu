package Gun14;

import java.util.Scanner;

public class _06_Forloop {
    public static void main(String[] args) {
        //kullanıcının gireceği bir ramaka (dahil) kadar
        // olan sayıları toplamıonı bulunuz

        Scanner read=new Scanner(System.in);
        System.out.println("sayiiyi girinz");
        int i= read.nextInt();
        int toplam=0;
        for (int cnt=1 ;cnt<=i ;cnt++){

            toplam=toplam+cnt;

        }
        System.out.println(toplam);



    }
}

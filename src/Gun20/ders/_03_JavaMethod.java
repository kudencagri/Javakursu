package Gun20.ders;



import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayıdan büyük olanı bulma işlemini bir metodda yaptıktan sonra mainde yazdırınz.
        Scanner oku=new Scanner(System.in);
        System.out.println("1.sayi");
        int sayi1=oku.nextInt();
        System.out.println("2.sayi");
        int sayi2=oku.nextInt();
        int enb=enbBuyuk(sayi1,sayi2);
        System.out.println("büyük sayi="+enb);

    }
    public static int enbBuyuk(int s1,int s2){
        int enb=0;                         ///////////////// bu satırların yerine return (s1>s2 ? s1: s2); de olur.
        enb=(s1>s2 ? s1: s2);
        return enb;
    }


}

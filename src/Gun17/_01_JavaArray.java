package Gun17;

public class _01_JavaArray {
    public static void main(String[] args) {
        //50 elemanlı bir dizi tanımlayınız.//10 a kada olan sayılardan random atayarak doldurunuz.Sonrasında ayrı bir döngü ile tek olanlar1 çit olanlara 0 atayıznız.

        int[] dizi=new int[50];
        int[] dizi2=new int[50];

        for (int i = 0; i <50 ; i++) {
            double deger=Math.random();
            double yenideger=deger*10;
            dizi[i]=(int)(yenideger);
        }
        for (int i = 0; i <50 ; i++) {
            if(dizi[i]%2==0){
                dizi2[i]=0;
            } else {
                dizi2[i]=1;
            }
            System.out.print(dizi2[i]+" ");
        }

    }
}

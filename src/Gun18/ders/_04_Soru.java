package Gun18.ders;

public class _04_Soru {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz.
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz.

        int[][] size=new int[2][3];
        int tek=0;

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                size[i][j]=(int) (Math.random()*100);
                if (size[i][j]%2==1){
                    tek++;
                }
                System.out.print(size[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("tek sayılar="+tek);

    }
}

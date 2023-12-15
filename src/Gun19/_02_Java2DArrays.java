package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo=new int[2][3];
        int[][] tablo2={
                {2,55},             // 0.satır 2 sutun
                {3,56,77,88,23,1},    // 1.satır 5sutun
                {23,2,3},               // 2.satır 2 sutun
                {13,44,55,66,13,51},     //3.satir 6 sutun
                {43,54,67,89,32,32,32,1,12,32} // 4.satır 10 sutun

        };
        for (int i = 0; i < tablo2.length ; i++) {
            for (int j = 0; j < tablo2[i].length ; j++) {
                System.out.print(tablo2[i][j]+" ");
            }
            System.out.println();
        }


    }
}

package Gun18.odev;

public class _01_odev {
    public static void main(String[] args) {
        //Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        //Bütün 2'leri 6'yla değiştirin.
        //Array'i yazdırınız.
        int[][] array={{2,3,2} , {4,1,5} , {7,2,5}};
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (array[i][j]==2){
                    array[i][j]=6;
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }



    }
}

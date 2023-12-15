package Gun16.odev;

public class _10_Odev {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.
        int[] arr={14 , 19 , 5 , 21};
        int Enkucuk=arr[0];
        for (int i = 0; i < arr.length ; i++) {

            if (Enkucuk >= arr[i]) {
              Enkucuk=arr[i];
            }

        }
        System.out.println("Enkucuk = " + Enkucuk);




    }
}

package Gun14;

public class _07_ForLoop {
    public static void main(String[] args) {
        // 0 dan 100 e kadar çift sayıların toplamını bulunz
        // toplam 50 yi geçince mesaj yazınız.
        int toplam=0;
        boolean sinirasildi=false;

        for (int i=1 ;i<=100 ;i++){
            if (i%2==0){
                toplam=toplam+i;
            }
            if (toplam>=50 && sinirasildi==false){
                System.out.println("50yi geçtiniz" );
                sinirasildi=true;
            }
            System.out.println(toplam);


        }
    }
}

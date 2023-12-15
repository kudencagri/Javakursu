package Gun04;

public class _04_ornek2 {
    public static void main(String[] args) {
        String bagis1="500";  // kelime
        String bagis2="1500";  //kelime

        // bana miktar lazım
        //int toplam=bagis1+bagis2; bu işlem geçersiz oluyor
        // bunların inte dönüşmesi lazım

        int rakambagis1= Integer.parseInt(bagis1);
        int rakambagis2= Integer.parseInt(bagis2);
        int toplam= rakambagis1+rakambagis2;
        System.out.println("toplam="+toplam);

    }
}

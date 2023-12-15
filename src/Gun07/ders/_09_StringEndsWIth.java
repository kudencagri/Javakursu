package Gun07.ders;

public class _09_StringEndsWIth {
    public static void main(String[] args) {
        // EndsWith verilen karekter(ler) ile bitiyormu
        //sonuc bloone a döner true false

        String text="Merhaba Dünya";
        System.out.println("text.endsWith(ya)"+text.endsWith("ya"));
        System.out.println("text.endsWith(n)"+text.endsWith("n"));
        System.out.println("text.endsWith(A)"+text.endsWith("A"));
        System.out.println("text.endsWith(Dünya)"+text.endsWith("Dünya"));
    }
}

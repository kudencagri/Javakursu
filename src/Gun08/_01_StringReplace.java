package Gun08;

public class _01_StringReplace {
    public static void main(String[] args) {
        // replace: bir string içindeki karekterleri verlenşe değiştirir.hepsini

        String text="Merhaba DÜnya";
        System.out.println("text="+text);
        System.out.println("text.replace(a,e)="+text.replace("a","e"));
        System.out.println(text.replace("ba","dess"));
        System.out.println(text.replace("a",""));// a lar silinir


    }
}

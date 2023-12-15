package Gun08;

public class _03_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalısışır farkı Kriter (regex"regular expression") veriliyor.
        String text="Merhaba1 Dünya234";
        System.out.println(text);

        System.out.println(text.replaceAll("[abn]","_"));// a,b,n leri _ yap demek
        System.out.println(text.replaceAll("[A-Z]","_"));// A dan Zye kadar harfleri _ yaptı.
        System.out.println(text.replaceAll("[0-9]",""));
        System.out.println(text.replaceAll("[^0-9]",""));// 0-9 dışındakileri siler




    }
}

package Gun07.ders;

import java.util.SortedMap;

public class _10_StringToLowerCase {
    public static void main(String[] args) {

        // olan durum tamamen küçük harfe çevirir.
        String text="Merhaba Dünya";
        System.out.println("orjinal"+" "+text);
        //System.out.println("chance "+" "+text.toLowerCase());

        String last=text.toLowerCase();
        Boolean basliyormu=last.startsWith("m");
        System.out.println("basliyormu"+basliyormu);
    }

}

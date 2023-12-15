package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _04_JavaMap {
    public static void main(String[] args) {
        //bir kartvizit uygulumasını 2 kişi için yapınız.
        Map<String,String> ugurKartVizit=new HashMap<>();
        ugurKartVizit.put("isim","Uğur Yılmaz");
        ugurKartVizit.put("email","Ugur_Yılmaz@gmail.com");
        ugurKartVizit.put("adres","çekme köy/ istanbul");
        ugurKartVizit.put("telefon","05384899845");
        System.out.println("ugurKartVizit.get(\"isim\") = " + ugurKartVizit.get("isim"));
        System.out.println("ugurKartVizit.get(\"email\") = " + ugurKartVizit.get("email"));

        Map<String,String> zaferKartVizit=new HashMap<>();

        zaferKartVizit.put("isim","zafer Canlı");
        zaferKartVizit.put("email","Zafer_Canlı@gmail.com");
        zaferKartVizit.put("adres", " çekme köy/ istanbul");
        zaferKartVizit.put("telefon","05384899845");
        System.out.println("ugurKartVizit.get(\"isim\") = " + ugurKartVizit.get("isim"));
        System.out.println("ugurKartVizit.get(\"email\") = " + ugurKartVizit.get("email"));

        Map<String,   Map<String,String>> KartVizitler=new HashMap<>();

        KartVizitler.put("zafer",zaferKartVizit);
        KartVizitler.put("ugur",ugurKartVizit);

        System.out.println(KartVizitler.get("zafer").get("adres"));
        System.out.println(KartVizitler.get("ugur").get("adres"));

        for (Map.Entry<String,   Map<String,String>> kv : KartVizitler.entrySet() ){ // entrySet() key+ Values
            System.out.println("Emailler="+kv.getValue().get("email"));
        }



    }
}

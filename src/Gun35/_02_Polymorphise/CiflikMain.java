package Gun35._02_Polymorphise;

public class CiflikMain {
    public static void main(String[] args) { // ******************* okulda fizik öğretmesin mahallede biri sana ders ver diyor  sen ne dersi verirsin (fizik) mevzu bu
        Kopek kopek1=new Kopek("karabaş");
//        kopek1.ses();  // havladı
//        kopek1.kokladi(); // kokladı
//        System.out.println("kopek1 = " + kopek1);
        Kedi kedi1=new Kedi("tekir");
//        kedi1.ses();
//        kedi1.tirmaladi();
//        System.out.println("kedi1 = " + kedi1);

//        kopekSesi(kopek1);
//        kediSesi(kedi1);

        hayvanSesi(kopek1);
        hayvanSesi(kedi1);

        //                      setlerden Hashset
//                      maplardan HashMap
//                      Listlerden Array list


//                    Hayvanlardan hayvan
//                    Hayvanlardan Kedi
//                    Hayvanlardan köpek




        //Referansın TİPİ  // NESNEnin tipi
        Hayvan hayvan1=new Hayvan("ördek"); // hayvanlardan 1 hayvan
        Hayvan hayvan2=new Kopek("kangal");// hayvanlardan 1 kopek
        Hayvan hayvan3=new Kedi("boncuk");// haycanlardan 1 kedi

        System.out.println("-------------***-----------");
        hayvan1.ses();
        hayvan2.ses();
        hayvan3.ses();






















    }
    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses();// ses çıkardımı, havladı mı
        // bir classın aslında kim oldugunu bulma yöntemi
        if (hayvan instanceof Kopek)// hayvan aslında köpekmi
            ((Kopek)hayvan).kokladi();// böyle yapmasan alamazsın
        if (hayvan instanceof  Kedi)// hayvan aslında kedimi
            ((Kedi) hayvan).tirmaladi();
    }
    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }
    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }
}








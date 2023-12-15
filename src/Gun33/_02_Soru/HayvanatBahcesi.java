package Gun33._02_Soru;

public class HayvanatBahcesi {
    public static void main(String[] args) {

        Kedi kedi1=new Kedi("Siyah",3,"tekir");
        kedi1.konustu();
        System.out.println("kedi1"+kedi1+"\n"+"\n");


        Kopek kopek1=new Kopek("sarı",12,"sokak");
        kopek1.konustu();
        System.out.println("kopek1 = " + kopek1+"\n"+"\n");

        Yilan yilan1=new Yilan("yeşil",3,"anakonda",23);
        yilan1.konustu();
        System.out.println("yilan1 = " + yilan1+"\n"+"\n");

        Ordek ordek1=new Ordek("sarı",3,"yeşil Ördek",32);
        ordek1.konustu();
        System.out.println("ordek1 = " + ordek1+"\n"+"\n");




    }

}

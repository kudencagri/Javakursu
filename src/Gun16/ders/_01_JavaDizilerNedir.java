package Gun16.ders;

public class _01_JavaDizilerNedir {
    public static void main(String[] args) {
        
        // bana bir tanımlamada birden fazla değer tutabilen bir değişkene ihttiyacın var;
        
        int [] notlar=new int[50]; // 50 tane int saklayabilen notlar isimli değişken.
        notlar [0] = 75 ;
        notlar [1] = 88 ;
        // ...
        // ...
        notlar [49]=95 ; // en son toplam elmana sayısı -1 yani 0- 49 indek vardır
        System.out.println("notlar[0] = " + notlar[0]);
        System.out.println("notlar.length = " + notlar.length);
        
        
    }
}

package Gun18.odev;

public class _03_odev {
    public static void main(String[] args) {
        //Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        //[{"new jersey","atlanta","ohio"} ,
        //{"Pittsburgh" ,"ohio","ohio"} ,
        //{"ohio","new york", "new jersey"}]
        //Bütün ohio'ları Florida'yla değiştiriniz.
        //Array'i yazdırınız.
        String[][] dizi={{"new jersey","atlanta","ohio"} ,{"Pittsburgh" ,"ohio","ohio"} , {"ohio","new york", "new jersey"}};
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                if (dizi[i][j]=="ohio") {
                    dizi[i][j]="Florida";
                }
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }


    }
}

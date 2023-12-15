package Gun28._03_Ornek;

import Gun28._02_Ornek.Ozellik;

public class kitap {
    public static void main(String[] args) {
        Gun28._02_Ornek.Ozellik book1=new Gun28._02_Ornek.Ozellik("son",2012,"rıdvan");
        Gun28._02_Ornek.Ozellik book2=new Gun28._02_Ornek.Ozellik("ilk",2013,"ahmet");
        Gun28._02_Ornek.Ozellik book3=new Ozellik("orta",2014,"mehmet");

        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("book3 = " + book3);
    }
}

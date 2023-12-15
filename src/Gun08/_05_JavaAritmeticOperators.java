package Gun08;

public class _05_JavaAritmeticOperators {
    public static void main(String[] args) {
        int sayac=0;
        sayac=sayac+1;// sayının değerini 1 tane arttırıyor. 1
        sayac++;      // sayının değerini 1 tane arttırıyor. 2
        ++sayac;      // sayının değerini 1 tane arttırıyor. 3
        //**********************************

        sayac=sayac-1;// sayının değerini 1 tane azaltıyor.2
        sayac--;      // sayının değerini 1 tane azaltıyor.1
        --sayac ;     // sayının değerini 1 tane azaltıyor.0

        System.out.println(sayac);

        int toplam= 5+sayac;// önce; sayac=0, toplam=0 sonra>> toplam=5 sayac=0
        toplam=0;
        toplam+=6; // anın artış değeri 6 dır

        toplam=5+sayac++;//
        System.out.println(toplam);



    }
}

package Gun31._04_;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();


        int secim=0;
        do {
            menu();// Menuyu Göster
            secim=oku.nextInt();// secimi oku
            //secime göre pizzayi ArrayListe Ekle
            switch (secim){
                case 1:
                    Pizza ps=new Pizza(PizzaSize.small);
                    siparisler.add(ps);
                    break;
                case 2:
                    Pizza pm=new Pizza(PizzaSize.Medium);
                    siparisler.add(pm);
                    break;
                case 3:
                    Pizza pl=new Pizza(PizzaSize.large);
                    siparisler.add(pl);
                    break;
                case 4: siparisYazdir(siparisler);
                break;
            }



        }while (secim<5);
    }
    public static void  siparisYazdir(ArrayList<Pizza> siparisler){
        int s=0,m=0,l=0;
        for (Pizza p:siparisler){
            switch (p.size){
                case small: s++;break;
                case Medium: m++;break;
                case large: l++;break;
            }
        }
        System.out.println(s+" tane Small Pizza");
        System.out.println(m+" tane medium pizza");
        System.out.println(l+" tane large pizza");
    }
    public static void menu(){
        System.out.println("********* Pizza Hot ********");
        System.out.println("1-Small Pizza");
        System.out.println("2-Medium Pizza");
        System.out.println("3-Large Pizza");
        System.out.println("4- Siparişleri Yazdır.");
        System.out.println("5-Çıkış ver ve İşleme Başla");
        System.out.println("Seçiminiz= ");

    }
}

package Gun26._02_soru;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);


        Person kisi=new Person();

        System.out.println("name girin");
        kisi.name=okuStr.nextLine();

        System.out.println("surname girin");
        kisi.surname =okuStr.nextLine();

        System.out.println("age girin");
        kisi.age= okuInt.nextInt();

    }
}

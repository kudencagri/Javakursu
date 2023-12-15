package Gun19;

public class _05_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();//Math.Random();
        merhabaYaz();
        merhabaYazIsme("ismet");// Math.abs(-10)
    }
    public static void merhabaYaz(){

        System.out.println("merhaba dünya");
    }
    public static void merhabaYazIsme(String ad){

        System.out.println("Merhaba"+ad);
    }
    public static void merhabaYazIsme(int miktar){
        for (int i = 0; i <miktar ; i++) {
            System.out.println("merhaba");
        }

    }
}

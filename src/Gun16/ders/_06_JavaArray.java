package Gun16.ders;

public class _06_JavaArray {
    public static void main(String[] args) {
       // 5 tv kanalı ismini bir diziye doldurun trtr,kanald,atv,fox,habertürk
        // bana sonra random olarak bir tanesini seçip ekrana yazdırsın
        String[] program = {"trt", "kanald", "atv", "fox", "haberturk"};
        int rndIndex=(int) (Math.random()* program.length);
        System.out.println("rasgele seçilen program="+program[rndIndex]);




    }
}

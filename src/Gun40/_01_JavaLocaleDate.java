package Gun40;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _01_JavaLocaleDate {
    public static void main(String[] args) {
        // LocalDate sadece gun ay yıl bilgisini tutar.

        LocalDate tarih=LocalDate.now(); // şuanki tarihi ver.
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());// ayın kaç gün
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        System.out.println("***************************************************************");
        // kendinin hazır formatlara bakalım : WİDOWSUN yerel ayarlarına göre değişebilir.

        System.out.println("ISO_Date = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDİUM ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n**********************************************************************************");

        // istediğimiz formatta gösterim.

        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelformat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("ozelformat1  \"dd/MM/yyyy\" = " + tarih.format(ozelformat1));


        DateTimeFormatter ozel2=DateTimeFormatter.ofPattern("d/M/yy");
        System.out.println("ozel2  d/M/yy = " + tarih.format(ozel2));


        DateTimeFormatter ozel3=DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");
        System.out.println("ozel3  EEEE dd/MM/yyy = " + tarih.format(ozel3));



        DateTimeFormatter ozel4=DateTimeFormatter.ofPattern("EE dd/MM/yyyy");
        System.out.println("ozel4  EE dd/MM/yyy = " + tarih.format(ozel4));


        DateTimeFormatter ozel5=DateTimeFormatter.ofPattern("EEEE MMMM  dd/MM/yyyy");
        System.out.println("ozel5 MMMM  EEEE dd/MM/yyy = " + tarih.format(ozel5));


        DateTimeFormatter ozel6=DateTimeFormatter.ofPattern("EEEE dd MMMM  dd/MM/yyyy");
        System.out.println("ozel6 MMMM dd EEEE dd/MM/yyy = " + tarih.format(ozel6));














        
    }
}

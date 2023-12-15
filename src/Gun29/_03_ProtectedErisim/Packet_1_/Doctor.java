package Gun29._03_ProtectedErisim.Packet_1_;

public class Doctor {
    public String hastane;// diğer paketlerden erişim izni verildi.
    String adi; // default
    protected String bolumu; // default aynı
    private String SicilNo;// değiştirilemez, sadece classın içinden erişile bilir.

     Doctor() { // sadece kendi paketinden erişilebilir.
    }
    public Doctor(String adi){
         this.adi=adi;
    }
}

package Gun34._03_Protected_konu._01_paket;

public class P1Hayvan {
    public String ad;// her yerden bütün paketlerden ılaşılabirl
    int yas;// default: sadece aynı paketten ulaşılabılır
    protected String cinsi;// default gibi ama extends yaparsan diğer paketlerden ulaşılabilir.
    private String renk;// sadece kendi bulunduğu classdan ulaşılabilir.
}

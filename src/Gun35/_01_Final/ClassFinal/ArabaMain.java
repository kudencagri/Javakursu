package Gun35._01_Final.ClassFinal;

public class ArabaMain {
    public static void main(String[] args) {
        Tasit t1=new Tasit();
        t1.model="opel";
        Tasit t2=new Tasit();
        t2.model="hoda";

        // kullanılan kısımda bir sınırlama yok class final olursa eger mainde birden fazla çağırılabiliyor fakat başka classa extend edilmez.
        // direk kullanılıyor kullanıcı hiç oynama yapamasın bankacılıkta varmış.


    }
}

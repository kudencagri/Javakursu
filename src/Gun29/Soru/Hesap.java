package Gun29.Soru;

public class Hesap {
    private int yatan;
    private int cekilen;
    private int bakiye;


   public void para_Yatir(int yatanPara){
       this.yatan=this.yatan+yatanPara;
       this.bakiye=this.bakiye+yatanPara;

   }
   public void Cekilen_para(int cekilenPara){
       this.cekilen=this.cekilen+cekilenPara;
       this.bakiye=this.bakiye-cekilenPara;

   }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + this.yatan +
                ", cekilen=" + this.cekilen +
                ", bakiye=" + this.bakiye +
                '}';
    }
}

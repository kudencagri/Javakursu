package Gun32._02_soru;

public class Field {
   private String Renk;
   private int Model;
   private int MotorHacmi;
   private int Kapisayisi;

   public Field() {
   }

   public Field(String renk, int model, int motorHacmi, int kapisayisi) {
     // Renk = renk;                       açık kapı oluyor oyüzden setle yapacan
     // Model = model;
     // MotorHacmi = motorHacmi;
      //Kapisayisi = kapisayisi;

      setRenk(renk);
      setModel(model);
      setMotorHacmi(motorHacmi);
      setKapisayisi(kapisayisi);

   }

   @Override
   public String toString() {
      return "Field{" +
              "Renk='" + Renk + '\'' +
              ", Model=" + Model +
              ", MotorHacmi=" + MotorHacmi +
              ", Kapisayisi=" + Kapisayisi +
              '}';
   }

   public String getRenk() {
      return Renk;
   }

   public void setRenk(String renk) {
      Renk = renk;
   }

   public int getModel() {
      return Model;
   }

   public void setModel(int model) {
      Model = model;
   }

   public int getMotorHacmi() {
      return MotorHacmi;
   }

   public void setMotorHacmi(int motorHacmi) {
      MotorHacmi = motorHacmi;
   }

   public int getKapisayisi() {
      return Kapisayisi;
   }

   public void setKapisayisi(int kapisayisi) {
      if (kapisayisi<7)
      this.Kapisayisi = kapisayisi;
      else
         System.out.println("hatalı giriş");
   }
}


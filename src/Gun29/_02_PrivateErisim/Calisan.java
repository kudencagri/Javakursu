package Gun29._02_PrivateErisim;

public class Calisan {
    int id;// default
    String Name; // default
    String Surname; // default
    private String password; // default


    public void SifreAta(String sifre){
        if (sifre.length()<8){
            System.out.println("Zayıf Şifre");
        }else{
            this.password=sifre;
            System.out.println("Şifre Başarıyla Atandı");
        }
    }
    public void SifreGoster(){
        System.out.println("*****"+this.password.substring(5));

    }
}

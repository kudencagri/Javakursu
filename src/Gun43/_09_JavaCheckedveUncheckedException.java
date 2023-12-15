package Gun43;


import Tools.Myfunc;

public class _09_JavaCheckedveUncheckedException {// bu durum 2 türlü kullanıla bilir mülakat SORUSU try catch e almak  la throws ınterruted exeption lada kullanılabilir.

    public static void main(String[] args)  {
        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.

        String kelime="";

        char ilkHarf=kelime.charAt(0);
        // zorunlu değil, UnChecked Exception

        Myfunc.bekle(100);


        try {
            Thread.sleep(1000); //Checked Exception
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}

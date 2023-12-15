package Gun37._01_Soru;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar_Electric teslaCarElectric=new TeslaCar_Electric(310.1,"Model 5");
        ToyotaPrius_Hybrid toyotaPriusHybrid=new ToyotaPrius_Hybrid(123.,"sedan");
        Bus_Deisel busDeisel=new Bus_Deisel(7000.,"IVECO");
        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(teslaCarElectric);
        arabalar.add(busDeisel);
        arabalar.add(toyotaPriusHybrid);


        for (Vehicle v: arabalar){
            System.out.println("*****************");
            System.out.println(v.getClass().getSimpleName());
            System.out.println("********************");
            System.out.println(v.getModel());
            System.out.println(v.getEngine());

            if (v instanceof TeslaCar_Electric){
                System.out.println(((TeslaCar_Electric) v).drive());
                System.out.println(((TeslaCar_Electric) v).chanceBattery());
            }


            if (v instanceof ToyotaPrius_Hybrid) {
                System.out.println(((ToyotaPrius_Hybrid) v).ChanceOil());
                System.out.println(((ToyotaPrius_Hybrid) v).drive());
                System.out.println(((ToyotaPrius_Hybrid) v).chanceBattery());
            }

            if (v instanceof Bus_Deisel) {
                System.out.println(((Bus_Deisel) v).ChangeDeisel());
                System.out.println(((Bus_Deisel)v).drive());


            }

        }



    }
}

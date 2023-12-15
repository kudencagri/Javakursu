package Gun36._06_Interface_Hoca_;

import Gun36._06_Interface_Hoca_.IGeometri;

public class Dikdortgen implements IGeometri {
    @Override
    public int alan(int kisaKenar, int uzunKenar) {
        return kisaKenar*uzunKenar;
    }

    @Override
    public int cevre(int kisaKenar, int uzunKenar) {
        return (kisaKenar+uzunKenar)*2;
    }
}

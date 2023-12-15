package Gun34._03_Protected_konu._02_paket;

import Gun34._03_Protected_konu._01_paket.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p1Hayvan=new P1Hayvan();
        p1Hayvan.ad="ismet";// sadece public e ulaşıldı default ve protected ulaşılmadı


        P2Kedi p2Kedi=new P2Kedi("","");


    }
}

package Gun15;

public class _08_JavaNestedLoop {
    public static void main(String[] args) {

        // aşıdaki görüntüyü veren programı yazınız
        //*
        //**
        //***
        //****
        //*****

        for ( int d = 1 ; d <= 5 ; d++ ) {
            for (int i = 1; i <= d; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

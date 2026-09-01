package Skoleoving;

import java.util.Scanner;

public class JP3_O1 {
    void main(){

        Scanner in = new Scanner(System.in);

        IO.print("Oppgi bruttoinntekt: ");

        double lonn = in.nextInt();
        int trinn0 = 226100, trinn1 = 318300, trinn2 = 725050, trinn3 = 980100, trinn4 = 1467200, trinn5 = 1467201;

        in.close();

        double sats1 = (trinn1 - trinn0) * 0.017, sats2 = (trinn2 - trinn1) * 0.04 + sats1, sats3 = (trinn3 - trinn2) * 0.137 + sats2, sats4 = (trinn4 - trinn3) * 0.168 + sats3, sats5 = (lonn - trinn5) * 0.178 + sats4;

        if(lonn <= trinn0){
            IO.print("Du betaler ikke trinnskatt.");
        } else if(lonn <= trinn1){
            IO.println("Du kvalifiserer for trinn 1");
            IO.print("Du betaler" + " " + Math.round(sats1) + " kr " + "i trinnskatt, for trinn 1.");
        } else if(lonn <= trinn2){
            IO.println("Du kvalifiserer for trinn 2");
            IO.print("Du betaler" + " " + Math.round(sats2) + " kr " + "i trinnskatt, for trinn 2.");
        } else if(lonn <= trinn3){
            IO.println("Du kvalifiserer for trinn 3");
            IO.print("Du betaler" + " " + Math.round(sats3) + " kr " + "i trinnskatt, for trinn 3.");
        } else if(lonn <= trinn4){
            IO.println("Du kvalifiserer for trinn 4");
            IO.print("Du betaler" + " " + Math.round(sats4) + " kr " + "i trinnskatt, for trinn 4.");
        } else{
            IO.println("Du kvalifiserer for trinn 5");
            IO.print("Du betaler" + " " + Math.round(sats5) + " kr " + "i trinnskatt, for trinn 5.");
        }
    }
}

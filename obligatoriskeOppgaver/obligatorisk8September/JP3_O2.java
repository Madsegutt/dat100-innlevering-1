package Skoleoving;

import java.util.Scanner;

public class JP3_O2 {

    void main(){

        Scanner in = new Scanner(System.in);

        int f = 39, e = 49, d = 59, c = 79, b = 89, a = 100;

        for(int i = 1; i <= 10; i++) {

            IO.print("Oppgi poengsum: ");

            int score = in.nextInt();

            while (score < 0 || score > 100) {
                IO.println("Poengsum ikke gyldig.");
                IO.print("Oppgi gyldig poengsum: ");
                score = in.nextInt();
            }
            if (score <= f) {
                IO.println("Du fikk karakter F.");
            } else if (score <= e) {
                IO.println("Du fikk karakter E.");
            } else if (score <= d) {
                IO.println("Du fikk karakter D.");
            } else if (score <= c) {
                IO.println("Du fikk karakter C.");
            } else if (score <= b) {
                IO.println("Du fikk karakter B.");
            } else if (score <= a) {
                IO.println("Du fikk karakter A.");
            }
        }
        in.close();
    }
}

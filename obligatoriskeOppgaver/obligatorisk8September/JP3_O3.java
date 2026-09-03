package Skoleoving;

import java.util.Scanner;

public class JP3_O3 {

    void main() {

        Scanner in = new Scanner(System.in);

        IO.print("Skriv inn fakultet (positivt heltall): ");

        int n = in.nextInt();
        int sum = 1;

        while (n <= 0) {
            IO.println("Fakultet ikke gyldig.");
            IO.print("Oppgi gyldig fakultet: ");
            n = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        IO.print("Summen er " + sum + ".");

        in.close();
    }
}

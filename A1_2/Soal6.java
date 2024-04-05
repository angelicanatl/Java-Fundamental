// Angelica Natalie
// Assignment 1, Session 2
// 6. Meter/Minutes to Km/Hours

package A1_2;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble(); // in meter
        double duration = sc.nextDouble(); // in minutes
        System.out.printf("Kecepatan kendaraan adalah %.3f km/jam %n", (distance / 1000) / (duration / 60));

        sc.close();
    }
}

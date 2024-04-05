// Angelica Natalie
// Assignment 1, Session 2
// 1. Celcius to Fahrenheit

package A1_2;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celcius = sc.nextDouble();
        double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println(fahrenheit);

        sc.close();
    }
}

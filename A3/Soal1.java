// Angelica Natalie
// Assignment 3
// 1. Menentukan apakah suatu angka adalah genap atau ganjil.

package A3;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(evenOdd(n));
        sc.close();
    }

    static String evenOdd(int n) {
        if (n % 2 == 0) {
            return "genap";
        } else {
            return "ganjil";
        }

    }
}

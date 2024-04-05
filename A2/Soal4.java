// Angelica Natalie
// Assignment 2
// 4. Menampilkan desc nilai dan nama siswa sesuai input.

package A2;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = sc.next();
        int nilai = sc.nextInt();
        char score = '-';
        if (nilai >= 80) {
            score = 'A';
        } else if (nilai >= 65) {
            score = 'B';
        } else if (nilai >= 50) {
            score = 'C';
        } else if (nilai >= 35) {
            score = 'D';
        } else {
            score = 'E';
        }
        System.out.printf("nama: %s; score: %c", nama, score);

        sc.close();
    }
}

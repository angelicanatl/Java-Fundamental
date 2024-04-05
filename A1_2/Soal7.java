// Angelica Natalie
// Assignment 1, Session 2
// 7. Multidimensional Array

package A1_2;

public class Soal7 {
    public static void main(String[] args) {
        int[][] numbers = {
                { 1, 4, 10 },
                { 10, 8, 7, 11, 14 },
                { 3, 5, 7 },
                { 12, 90, 98, 7, 3, 5 },
                { 3, 9, 10, 5, 1 }
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) { // jika angka genap
                    System.out.printf("(%d, %d) %n", i, j); // print indeks
                }
            }
        }
    }
}

// Angelica Natalie
// Assignment 2
// 2. Mencari jumlah semua angka yang ada di dalam array 2 dimensi.

package A2;

public class Soal2 {
    public static void main(String[] args) {
        // Contoh input 1
        int[][] numbers1 = {
                { 1, 3, 4 },
                { 2 },
                { 3, 7, 10 }
        }; // output = 30

        // Contoh input 2
        int[][] numbers2 = {
                { 2, 9 },
                { 0, 3, 10 },
                { 1, 9 }
        }; // output = 34

        // Code
        int[][] numbers = numbers1; //misalkan pakai contoh input 1
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.printf("Hasil penjumlahan semua angka pada array numbers = %d %n", sum);
    }
}

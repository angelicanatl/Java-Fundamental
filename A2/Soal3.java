// Angelica Natalie
// Assignment 2
// 3. Menentukan apakah suatu array adalah deret geometri atau bukan.

package A2;

public class Soal3 {
    public static void main(String[] args) {
        // Contoh input 1
        int[] numbers1 = { 1, 3, 9, 27, 81 }; // output = true
        // Contoh input 2
        int[] numbers2 = { 2, 4, 8, 16, 32 }; // output = true
        // Contoh input 3
        int[] numbers3 = { 2, 4, 6, 8 }; // output = false
        // Contoh input 4
        int[] numbers4 = { 2, 6, 18, 54 }; // output = true
        // Contoh input 5
        int[] numbers5 = { 1, 2, 3, 4, 7, 9 }; // output = false

        // Code
        int[] numbers = numbers1; // misalkan pakai contoh input 1
        boolean geo = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % numbers[i - 1] != 0) {
                geo = false;
                break;
            }
        }
        System.out.println("Apakah array numbers adalah deret geometri? " + geo);
    }
}

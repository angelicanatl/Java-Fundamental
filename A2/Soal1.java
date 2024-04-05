// Angelica Natalie
// Assignment 2
// 1. Mencari median dari sebuah array satu dimensi.

package A2;

public class Soal1 {
    public static void main(String[] args) {
        // Contoh input 1
        int[] numbers1 = { 2, 3, 5, 7, 9 }; // output = 5

        // Contoh input 2
        int[] numbers2 = { 1, 2, 3, 4 }; // output = 2.5

        // Code
        int[] numbers = numbers1;   //misalkan pakai contoh input 1
        double med = 0;
        if (numbers.length % 2 == 0) {
            med = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) * 1.0 / 2;
        } else {
            med = numbers[numbers.length / 2];
        }
        System.out.println("Median dari array numbers = " + med);
    }
}

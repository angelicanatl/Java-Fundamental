// Angelica Natalie
// Assignment 1, Session 2
// 3. array of int

package A1_2;

public class Soal3 {
    public static void main(String[] args) {
        int[] number = { 1, 2, 10, 12 };
        double avg = 0;
        for (int i = 0; i < number.length; i++) {
            avg += (number[i] * 1.0) / number.length;
        }
        System.out.println(avg);
    }
}

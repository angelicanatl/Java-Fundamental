// Angelica Natalie
// Assignment 3
// 3. Menentukan nilai terbesar pada suatu array of integer. 

package A3;

public class Soal3 {
    public static void main(String[] args) {
        int[] arr = { 8, 5, 3, 0, 7, 1, 6, -4, 2, 9 };
        System.out.println(maxInArray(arr));
    }

    static int maxInArray(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}

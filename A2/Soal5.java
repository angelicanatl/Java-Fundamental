// Angelica Natalie
// Assignment 2
// 5. Menentukan angka terbesar dari sebuah array.

package A2;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.print("Masukkan angka pada array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("Angka terbesar pada array adalah " + max);
    }
}

// Angelica Natalie
// Assignment 3
// 2. Menentukan apakah suatu string palindrome atau tidak.

package A3;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str.toLowerCase()));
        sc.close();
    }

    static boolean isPalindrome(String s) {
        int lastIdx = s.length() - 1;
        for (int i = 0; i < lastIdx / 2; i++) {
            if (s.charAt(i) != s.charAt(lastIdx - i)) {
                return false;
            }
        }
        return true;
    }
}

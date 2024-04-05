//Angelica Natalie
//Assignment 1, Session 2

import java.util.Scanner;

public class A1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. celcius to fahrenheit
        double celcius = sc.nextDouble();
        double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println(fahrenheit);

        // 2. array of String
        String[] movie = { "Harry Potter", "Lord of the Rings", "The Hobbit", "Pirates of the Caribbean" };
        System.out.println(movie[3]);

        // 3. array of int
        int[] number = { 1, 2, 10, 12 };
        double avg = 0;
        for (int i = 0; i < number.length; i++) {
            avg += (number[i] * 1.0) / number.length;
        }
        System.out.println(avg);

        // 4. multidimensional array
        String[][] kelompok = {
                { "Rudi", "Budi", "Lila" },
                { "Erika", "Nina" },
                { "Lisa", "Anna" },
                { "Didit", "Resti", "Hana" }
        };
        System.out.println(kelompok[0][0]); //contoh akses

        // 5. minutes to seconds
        int minutes = sc.nextInt();
        System.out.println(minutes * 60);

        // 6. meter/minutes to km/jam
        double distance = sc.nextDouble(); // in meter
        double duration = sc.nextDouble(); // in minutes
        System.out.printf("Kecepatan kendaraan adalah %.3f km/jam %n", (distance / 1000) / (duration / 60));

        // 7. multidimensional array
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

        sc.close();
    }
}

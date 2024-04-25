// Angelica Natalie
// Live Assignment: Currency Converter (based on exchange rate on April 25, 2024)

package Live_Assignment;

import java.util.Scanner;

class Converter {
    private double inIDR;
    private char convertTo;

    public Converter(double inIDR, char convertTo) {
        this.inIDR = inIDR;
        this.convertTo = convertTo;
    }

    public void convert() {
        if (convertTo == 'A') {
            System.out.printf("Conversion result to USD is %.2f", (inIDR / 16185.45));
        } else if (convertTo == 'B') {
            System.out.printf("Conversion result to SGD is  %.2f", (inIDR / 11897.90));
        } else {
            System.out.printf("Conversion result to JPY is  %.2f", (inIDR / 104.02));
        }
    }
}

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("WELCOME TO CURRENCY CONVERSION APP!!");
        System.out.println("Input amount (in IDR)");

        Scanner sc = new Scanner(System.in);
        double idr = sc.nextDouble();

        System.out.println("Choose your conversion currency");
        System.out.println("A. USD\nB. SGD\nC. JPY");
        System.out.println("Input the conversion currency (Choose A/B/C):");

        char opt = sc.next().charAt(0);

        if (opt == 'A' || opt == 'B' || opt == 'C') {
            Converter conv = new Converter(idr, opt);
            conv.convert();
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}

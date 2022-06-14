package package_one;

import java.util.Scanner;

public class currency_conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        double indian_currency = input.nextDouble();
        double usd = indian_currency * 0.0128059;
        System.out.print("INR " + indian_currency + " = " + usd + " USD");
    }
}

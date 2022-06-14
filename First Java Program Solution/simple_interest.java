package package_one;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double principle = input.nextDouble();
        System.out.print("Enter rate: ");
        float rate = input.nextFloat();
        float rate_percent =  rate/100;
        System.out.print("Enter time in years: ");
        int time = input.nextInt();
        double si = principle * (1 + (time *rate_percent));
        System.out.println("Your simple interest is: " + si);
    }
}

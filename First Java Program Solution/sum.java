package package_one;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num1: ");
        int num1 = input.nextInt();
        System.out.println("enter num2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum is:" + sum);


    }
}

package package_one;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = input.nextInt();
        System.out.print("Enter second num: ");
        int num2 = input.nextInt();
        System.out.print("Enter operator: ");
        char operator = input.next().trim().charAt(0);

        if (operator == '+'){
            System.out.println("Sum is " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Diff is " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Mul is " + (num1 * num2));
        } else if (operator == '/') {
            System.out.println("Mul is " + (num1 / num2));
        }
        else{
            System.out.println("invalid input");
        }


    }
}

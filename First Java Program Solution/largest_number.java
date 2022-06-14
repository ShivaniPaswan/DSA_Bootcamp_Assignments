package package_one;

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int num1 = input.nextInt();
        System.out.println("Enter second num: ");
        int num2 = input.nextInt();
        if (num1>num2){
            System.out.println("Largest num is " + num1);
        }
        else{
            System.out.println("Largest num is " + num2);
        }


    }
}

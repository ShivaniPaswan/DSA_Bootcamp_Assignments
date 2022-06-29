package third_package;

import java.util.Scanner;

public class product_of_two_numbers {
    public static void main(String[] args) {
        int result = mul();
        System.out.println("product is " + result);
    }
    static int mul(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        int product = num1*num2;
        return product;
    }

}

package third_package;

import java.util.Scanner;

public class sum_of_two_numbers {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1= in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        int c = num1+num2;
//        System.out.println("Sum of "+ a + " and "+ b+ " is "+ c);
        return c;
    }

}

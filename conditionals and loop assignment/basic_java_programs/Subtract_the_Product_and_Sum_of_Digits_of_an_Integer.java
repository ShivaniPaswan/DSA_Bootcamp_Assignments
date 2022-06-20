package basic_java_programs;

import java.util.Scanner;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num: ");
        int number = input.nextInt();
        int sum = 0;
        int count =0;
        int mul = 1;
        while(number>0){
            int digits = number % 10;
            sum+=digits;
            mul *=digits;
            number = number/10;
            count++;
        }
        System.out.println("sum is: "+ sum);
        System.out.println("mul is: "+ mul);
        int diff = mul - sum;
        System.out.println("difference of product and sum is: " + diff);


    }

}

package basic_java_programs;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int a =0;
        int b=1;
//        for(int i = 2; i<=num;i++){
//            int c= a+b;
//            a=b;
//            b=c;
//            System.out.println(c);
        int count=2;
        while( count<=num ){
            int c = a+b;
            a=b;
            b=c;
            count++;
            System.out.println(c);



        }
    }
}

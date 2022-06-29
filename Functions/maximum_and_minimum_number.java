package third_package;

import java.util.Scanner;

public class maximum_and_minimum_number {
    public static void main(String[] args) {
        int max_of_3 = max();
        System.out.println("maximum number of all is " + max_of_3);

        int min_of_3 = min();
        System.out.println("minimum number of all is " + min_of_3);
    }
        static int max() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            int num1 = in.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = in.nextInt();
            System.out.print("Enter number 3: ");
            int num3 = in.nextInt();

            int max_num = num1;
            if(num2>max_num){
                max_num =num2;
            }
            if(num3 > max_num){
                max_num = num3;
            }
            return max_num;
    }

    static int min(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = in.nextInt();

        int min_num = num1;
        if(num2<min_num){
            min_num = num2;
        }
        if(num3<min_num){
            min_num = num3;
        }
        return min_num;

    }
}

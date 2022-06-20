package intermediate_java_programs;

import java.util.Scanner;

public class Sum_of_digits_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = in.nextInt();
        int sum = 0;
        int rem = 0;
        int temp = num;
        while(temp>0){
            rem=temp%10;
            temp/=10;
            sum+= rem;
        }
        System.out.println("Sum of " +num+ " is "+ sum);
    }
}

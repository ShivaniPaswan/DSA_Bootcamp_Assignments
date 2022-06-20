package basic_java_programs;

import java.util.Scanner;

public class sum_till_user_enters_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter num: ");
            int num = input.nextInt();
            if( num == 0){
                break;
            }
            sum+=num;
        }
        System.out.println("sum is : "+ sum);

}}

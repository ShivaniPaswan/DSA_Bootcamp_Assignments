package basic_java_programs;

import java.util.Scanner;

public class largest_num_till_user_enters_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(true){
            System.out.print("Enter num: ");
            int num = input.nextInt();
            if( num == 0){
                break;
            }
            if (num>max){
                max= num;
            }

        }
        System.out.println("Max is : "+ max);

    }
}

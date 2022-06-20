package intermediate_java_programs;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter palindrome number: ");
        int num = in.nextInt();
        int rev =0;
        int temp =num;
        while (temp > 0) {
            int end_digit = temp%10;
            temp = temp/10;
            rev= rev*10+end_digit;
        }
//        System.out.println(num);
//        System.out.println(rev);
        if(num==rev){
            System.out.println("Number " + num+ " is palindrome");
        }
        else{
            System.out.println("Number " + num + " is not palindrome");
        }
    }
    }


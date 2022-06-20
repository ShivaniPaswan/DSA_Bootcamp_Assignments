package intermediate_java_programs;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int ans = 0;

        while(num>0){
            int end_digit = num%10;
            num = num/10;
            ans= ans *10+end_digit;
        }
        System.out.println(ans);


    }
}

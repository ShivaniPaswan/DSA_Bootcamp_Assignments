package intermediate_java_programs;

import java.util.Scanner;

public class counting_occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int count =0;
        while (num>0){
           int rem = num%10;
            if (rem == 3){
                count++;
            }
            num=num/10;
        }
        System.out.print("Count is: "+ count);
    }
}

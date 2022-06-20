package intermediate_java_programs;

import java.util.Scanner;

public class sum_n_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        double sum=0;
        for(int i =1; i<=num; i++){
            sum+=i;
        }
        System.out.print("Sum of n number is: "+ sum);
    }

}

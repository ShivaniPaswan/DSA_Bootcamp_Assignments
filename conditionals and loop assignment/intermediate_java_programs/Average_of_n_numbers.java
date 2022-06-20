package intermediate_java_programs;

import java.util.Scanner;

public class Average_of_n_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num = in.nextInt();
        double sum = 0;
        int count=0;
        double average = 0;
        for(double i = num; i>0; i--){
            sum+=i;
            count++;
        }
        average = sum/count;
        System.out.println("count is- "+ count);
        System.out.println("sum is "+ sum);
        System.out.println("average is "+ average);
    }
}

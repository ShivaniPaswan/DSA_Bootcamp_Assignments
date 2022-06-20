package intermediate_java_programs;

import java.util.Scanner;

public class list_of_n_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nsum =0;
        int esum=0;
        int osum=0;

        while (true) {
            System.out.println("Enter num");
            int num = in.nextInt();
            if (num == 0){
                break;
            }
            if(num<0){
                nsum+=num;
            }
            if(num>0 && num%2==0){
                esum+=num;
            }
            if(num>0 && num%2!=0){
                osum+=num;
            }
        }
        System.out.println("Negative No. Sum = " + nsum);
        System.out.println("Positive Even No. Sum = " + esum);
        System.out.println("Positive Odd No. Sum = " + osum);

    }
}

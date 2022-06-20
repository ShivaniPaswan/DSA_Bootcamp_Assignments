package intermediate_java_programs;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = input.nextInt();
        System.out.print("Enter second num: ");
        int num2 = input.nextInt();

        for(int i = num1; i<num2; i++){
            int check, rem, sum= 0;
            check=i;
            while(check != 0){
                rem = check% 10;
                sum = sum +(rem*rem*rem);
                check= check/10;
            }
            if (sum ==i){
                System.out.println(""+i + " is Armstrong.");
            }
        }

        }


    }


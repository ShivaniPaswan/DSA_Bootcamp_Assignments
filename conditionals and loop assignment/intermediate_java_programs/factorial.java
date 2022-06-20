package intermediate_java_programs;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter factorial num: ");
        int num = input.nextInt();
        int mul = 1;
        for(int i = num; i>0; i--){
            mul= i*mul;
        }
        System.out.print(mul);


    }
}

package intermediate_java_programs;

import java.util.Scanner;

public class perfect_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();
        int sum= 0;
        for(int i = 1; i< num; i++){
            if(num%i == 0){
//                System.out.println(i);
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println(num + " is perfect number");
        }
        else{
            System.out.println(num + " is not perfect number");
        }
    }
}

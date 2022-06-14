package package_one;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to know odd or even: ");
        int num = input.nextInt();
//        System.out.print("yes ");
        if (num%2 == 0){
            System.out.println("Num " + num + " is even");
        }
        else{
            System.out.println("Num " + num + " is odd");
        }

    }
}

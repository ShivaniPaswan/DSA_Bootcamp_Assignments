package basic_java_programs;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.println("Factors of " +number+ " are-");

         for(int i =1; i<=number; i++){
             if(number%i == 0){
                 System.out.println(i);
             }
         }
    }
}

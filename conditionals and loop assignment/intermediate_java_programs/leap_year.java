package intermediate_java_programs;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = in.nextInt();
        if (year%4==0){
            if(year%100==0){
                if(year%400 ==0){
                    System.out.println(year + " is a leap year");
                }
                else{
                    System.out.println(year + " is not a leap year");
                }
            }
            else{
                System.out.println(year + " is a leap year");
            }
        }
        else{
            System.out.println(year + " is not a leap year");
        }

}}

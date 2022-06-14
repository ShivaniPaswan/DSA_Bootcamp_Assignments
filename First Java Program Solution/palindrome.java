package package_one;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string to check if it's palindrome: ");
        String original_string = input.next();
        int len = original_string.length();
        String rev ="";
        for (int j = len-1; j>=0; j--){
            rev = rev+original_string.charAt(j);
        }
        if(original_string.equals(rev)){
            System.out.println(rev + " is palindrome");
        }
        else{
            System.out.println(original_string + " is not palindrome- " + rev);
        }

    }
}

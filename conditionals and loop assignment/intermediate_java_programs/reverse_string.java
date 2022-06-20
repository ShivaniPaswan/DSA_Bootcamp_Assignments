package intermediate_java_programs;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String name = in.next();
        int length = name.length();
        String str= "";
        for(int i= length-1; i>=0; i--){
            str=str+name.charAt(i);
        }
        System.out.println(str);



    }
}

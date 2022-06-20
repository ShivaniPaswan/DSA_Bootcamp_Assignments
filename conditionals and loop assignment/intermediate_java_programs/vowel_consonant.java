package intermediate_java_programs;

import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter alphabet: ");
        char alphabet = in.next().charAt(0);
        if (alphabet == 'a' || alphabet == 'e'|| alphabet == 'i'||alphabet == 'o'||alphabet == 'u'){
            System.out.println(alphabet+ " is vowel");
        }
        else{
            System.out.println(alphabet+ " is consonant");
        }
    }
}

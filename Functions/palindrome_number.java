package third_package;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class palindrome_number {
    public static void main(String[] args) {
         palindrome(232);
    }
    static int palindrome(int num){
        int temp = num;
        int rev_num =0;
        while (temp>0){
            int end_digit = temp%10;
            temp/=10;
            rev_num = (rev_num*10)+end_digit;
        }
        if(rev_num== num){
            System.out.println(num + " is palindrome");
}else {
            System.out.println(num+ " is not palindrome");
          } return rev_num;



    }}

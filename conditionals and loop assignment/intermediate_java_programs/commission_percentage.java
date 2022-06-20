package intermediate_java_programs;

import java.util.Scanner;

public class commission_percentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter sale price: ");
        double sale_price = in.nextDouble();
        double commission_rate = 0.03;
//        System.out.println(commission_rate);
        double commission_percentage = sale_price*commission_rate;
        System.out.print("Commission percent is: "+ commission_percentage );
    }
}

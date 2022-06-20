package intermediate_java_programs;

import java.util.Scanner;

//20 percent discount on all product
public class Discount_of_product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter product price: ");
        double price = in.nextDouble();
        System.out.print("Enter Discount percent: ");
        double discount_percent = in.nextDouble();
        double discount_price = (price/100)*discount_percent;
        double sale_price = price - discount_price;
        System.out.print("Discount price is- "+ sale_price);

    }
}

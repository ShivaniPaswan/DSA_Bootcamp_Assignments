package package_one;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name);
    }
}

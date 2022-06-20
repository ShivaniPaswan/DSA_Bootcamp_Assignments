package intermediate_java_programs;

import java.util.Scanner;

public class distance_between_two_points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x1 of point 1: ");
        int x1 = in.nextInt();
        System.out.print("Enter x2 of point 1: ");
        int x2 = in.nextInt();

        System.out.print("Enter y1 of point 2: ");
        int y1 = in.nextInt();
        System.out.print("Enter y2 of point 2: ");
        int y2 = in.nextInt();

        double points= (((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        double distance = Math.sqrt(points);
        System.out.println("Distance is: " + distance);

    }
}

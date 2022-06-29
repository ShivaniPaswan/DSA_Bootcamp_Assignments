package third_package;

import java.util.Scanner;

public class circumference_area_of_a_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = in.nextFloat();
        circle(radius);

    }
    static void circle(float radius){
        float circumference = (float) (2* 3.14*radius);
        float area = (float) (3.14*radius*radius);
        System.out.println("circumference_of_circle is " + circumference);
        System.out.println("area_of_circle is " + area);


    }


}

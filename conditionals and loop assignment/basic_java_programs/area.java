package basic_java_programs;

public class area {
    public static void main(String[] args) {
        double pi = 3.1415;
        int radius = 5;
        double area_of_circle = pi* radius*radius;
        System.out.println("Area of circle is: "+ area_of_circle);

        int height = 10;
        int base = 20;
        int area_of_triangle = (height*base)/2;
        System.out.println("Area of triangle is: " + area_of_triangle);
//        same formula
        System.out.println("Area of isosceles triangle is: " + area_of_triangle);

        int length = 100;
        int width = 200;
        int area_of_rectangle = (length*width);
        System.out.println("Area of rectangle is: " + area_of_rectangle);

        System.out.println("Area of parallelogram is " + (base*height));

        int diagonal1 = 50;
        int diagonal2 = 60;
        System.out.println("Area of rhombus is " + (diagonal1*diagonal2));

        double root3 = 1.732;
        int side = 4;
        double area_of_equi_triangle = (root3/4* (side*side));
        System.out.println("Area of equilateral triangle is " +  area_of_equi_triangle);

    }
}

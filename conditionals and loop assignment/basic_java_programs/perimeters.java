package basic_java_programs;

public class perimeters {
    public static void main(String[] args) {
        double pi = 3.1415;
        int radius = 5;
        double perimeter_of_circle = 2*(pi* radius);
        System.out.println("Perimeter of circle is: "+ perimeter_of_circle);

        int side = 4;
        double perimeter_of_equilateral_triangle = 3*side;
        System.out.println("Perimeter of equilateral triangle is " +  perimeter_of_equilateral_triangle);

        int length = 100;
        int width = 200;
        int perimeter_of_parallelogram = 2*(length+width);
        System.out.println("Perimeter of rectangle is: " + perimeter_of_parallelogram);

        System.out.println("Perimeter of square is: " + 4*side);
        System.out.println("Perimeter of rhombus is: " + 4*side);

    }
}

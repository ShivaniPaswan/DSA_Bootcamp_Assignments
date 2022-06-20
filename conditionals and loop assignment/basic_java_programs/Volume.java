package basic_java_programs;

public class Volume {
    public static void main(String[] args) {
        double pi = 3.1415;
        int radius = 5;
        int height = 5;
        int length = 10;
        int width =20;
        int side = 8;
        double volume_of_cone = ((pi* radius*radius) *(height)/3);
        System.out.println("Volume of cone is: "+ volume_of_cone);

        int base = 20;
        int volume_of_prism = (height*base);
        System.out.println("Volume of prism is: " + volume_of_prism);

        System.out.println("Volume of cylinder is: " + (pi*radius*radius*height));
        System.out.println("Volume of sphere is: " + ((4/3)*(pi*radius*radius*radius)));
        System.out.println("Volume of pyramid is: " + ((height*width*length)/3));
        System.out.println("Curved surface area of cylinder is: " + (2*pi*radius*height));
        System.out.println("Total Surface Area Of Cube: " + (6*(side*side)));
    }
}

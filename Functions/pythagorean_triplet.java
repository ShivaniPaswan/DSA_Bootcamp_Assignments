package third_package;

public class pythagorean_triplet {
    public static void main(String[] args) {
        boolean result = pythagorean();
        System.out.println(result);


    }
    static boolean pythagorean(){
        int a=3, b=4, c=5;
        int sum = ((a*a)+(b*b));
        if( c*c == sum){
//            System.out.println("it is pythagorean triplet");
            return true;
        }
        else{
//            System.out.println("it is not pythagorean triplet");
            return false;
        }

    }
}

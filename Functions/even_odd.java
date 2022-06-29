package third_package;

public class even_odd {
    public static void main(String[] args) {
        check(6);

    }
    static void check(int a){
        if (a%2==0){
            System.out.println(a +" is even number");
        }
        else{
            System.out.println(a + " is odd number");
        }

    }
}

package third_package;

public class factorial {
    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println(result);
    }
    static int factorial(int num){
        int mul =1;
        for (int i = 1; i<=num; i++){
            mul*=i;
        }
        return mul;

    }
}

package third_package;

public class prime_number {
    public static void main(String[] args) {
    boolean result = prime(12);
    System.out.print(result);
    }
    static boolean prime(int n){
        if (n <= 1) {
            return false;
        }
        int c=2;
        while (c*c <=n){
            if(n%c ==0){
                return false;
            }
            c+=1;
        }
        return true;

    }
}

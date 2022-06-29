package third_package;

public class sum_of_natural_nos {
    public static void main(String[] args) {
        natural_nos();

    }
    static void natural_nos(){
        int num = 10, sum=0;
        for(int i =num; i>=1; i--){
            sum+=i;
        }
        System.out.println(sum);

    }

}

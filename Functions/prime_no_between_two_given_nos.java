package third_package;

public class prime_no_between_two_given_nos {
    public static void main(String[] args) {
        prime();

    }
    static void prime(){
        int a= 2, b=15;
        System.out.println("Prime numbers are-");
        for(int i = a; i<=b;i++){
            if(i%2!=0){
                System.out.print(" "+ i);

            }
        }




    }

}

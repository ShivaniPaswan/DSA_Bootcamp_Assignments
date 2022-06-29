package third_package;

public class Eligible_to_vote {
    public static void main(String[] args) {
    vote(76);
    }

    static void vote(int age){
        if (age>=18){
            System.out.println(age+ " so Person is eligible to vote");
        }
        else{
            System.out.println(age+ " so Person is not eligible to vote");
        }

    }


}

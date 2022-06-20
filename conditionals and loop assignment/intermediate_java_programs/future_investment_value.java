package intermediate_java_programs;

public class future_investment_value {
    public static void main(String[] args) {
        double present_value = 10000;
        double interest_rate = 0.12;
        int years = 7;
        double future_investment = present_value *Math.pow((1+interest_rate),years );
        System.out.println("Future investment is: " + future_investment);
    }
}

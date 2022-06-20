package intermediate_java_programs;

public class hcf_lcm {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 120;
        int hcf = 0;
        for (int i =1; i<=num1; i++){
            if(num1%i == 0 && num2%i==0){
                hcf =i;
            }
        }
        int lcm = (num1*num2/hcf);
        System.out.println("HCF is "+ hcf);
        System.out.print("LCM is "+ lcm);

    }
}

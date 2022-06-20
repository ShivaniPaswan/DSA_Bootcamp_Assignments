package intermediate_java_programs;

import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of units you consumed in a month: ");
        float units = in.nextFloat();
        double payAmount = 0;
        double Total = 0;
        double fixed_charge = 0;

        if (units <=100){
            payAmount=units*1.5;
            fixed_charge=25.00;
        }
        else if (units<=200) {
            payAmount=(100*1.5)+(units-100)*2.5;
            fixed_charge=50.00;
        }
        else if (units<=300) {
            payAmount=(100*1.5)+(200-100)*2.5+(units-200)*4;
            fixed_charge=75.00;
        }
        else if(units<=350) {
            payAmount = (100 * 1.5) + (200 - 100) * 2.5 + (300 - 200) * 4 + (units - 300) * 5;
            fixed_charge = 100.00;
        }
        else {
            payAmount = 0;
            fixed_charge = 1500.00;
        }
        Total = payAmount + fixed_charge;
        System.out.println("Your electricity bill is- " + Total );
    }
}

package intermediate_java_programs;

import java.util.Scanner;
import java.util.SortedMap;

public class even_days_of_august_month {
    public static void main(String[] args) {
        int count= 0;
        for(int i =1; i<=31;i++){
            if(i%2==0){
                count++;
            }
            }
        System.out.println("Kunal can go out "+ count+ " days in month of August");
        }

}

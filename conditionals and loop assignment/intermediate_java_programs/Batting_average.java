package intermediate_java_programs;

import java.util.Scanner;

public class Batting_average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int runs_scored = 100;
        int out_times = 4;
        int batting_average = runs_scored/out_times;
        System.out.print("Batting Average is: "+ batting_average);
    }
}

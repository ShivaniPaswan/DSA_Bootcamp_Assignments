package intermediate_java_programs;

import java.util.Scanner;

public class CAL_CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total number of subjects- ");
        int subjects = in.nextInt();
        double sum = 0;
        for (int i = 1; i<=subjects;i++){
            System.out.print("Enter marks " + i + "- ");
            int marks = in.nextInt();
            sum+=marks;
        }


        double CGPA = sum/subjects;
        System.out.println("CGPA IS "+ CGPA);

    }
}

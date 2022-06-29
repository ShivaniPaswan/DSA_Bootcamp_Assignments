package third_package;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
    grade();
    }
    static void grade(){
        Scanner in = new Scanner(System.in);
        float sum =0, percentage;
        int gpa;
        for(int i =1; i<=5; i++) {
            System.out.print("Enter your marks of subject "+ i + "-");
            int grade = in.nextInt();
            sum+=grade;

        }
        System.out.println(sum);
        percentage = (sum/(5*100))*100;
        System.out.println(percentage);
        gpa = (int) (percentage/10);
        System.out.println(gpa);

        switch (gpa){
            case 10:
                System.out.println("Grade: A++");
                break;
            case 9:
                System.out.println("Grade: A+");
                break;
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("fail");
                break;
        }



    }
}

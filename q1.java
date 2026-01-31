import java.util.Scanner;

public class PercentageCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int marks, totalMarks=0, subjects=5;

        for (int i=0; i<subjects; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks=sc.nextInt();
            totalMarks+=marks;
        }

        float percentage=(float)totalMarks/(subjects*100)*100;

        System.out.printf("Percentage = %.2f%%\n", percentage);

        sc.close();
    }
}

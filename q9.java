import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents=sc.nextInt();

        int totalMarks=0;
        int passCount=0;
        int failCount=0;

        for (int i=1; i<=numStudents; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            int marks=sc.nextInt();

            totalMarks+=marks;

            if (marks>=60) {
                passCount++;
            } else{
                failCount++;
            }
        }

        double average=(double) totalMarks/numStudents;

        System.out.println("\n--- Grade Summary ---");
        System.out.println("Number of students: " + numStudents);
        System.out.println("Average marks: " + String.format("%.2f", average));
        System.out.println("Number of students who passed: " + passCount);
        System.out.println("Number of students who failed: " + failCount);

        sc.close();
    }
}

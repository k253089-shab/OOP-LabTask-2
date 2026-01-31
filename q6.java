import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter your registered courses (separated by commas): ");
        String courses = sc.nextLine();

        System.out.println("\n----- Student Information -----");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Registered Courses: " + courses);

        sc.close();
    }
}

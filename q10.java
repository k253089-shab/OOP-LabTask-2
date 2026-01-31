import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String correctUsername = "user123";
        String correctPassword = "pass123";

        System.out.print("Enter username: ");
        String username=sc.nextLine();

        System.out.print("Enter password: ");
        String password=sc.nextLine();

        if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
            System.out.println("Incorrect username or password! Exiting...");
            sc.close();
            return;
        }

        System.out.println("\nLogin successful!");
        double balance=0.0;
        char continueChoice;

        do {
            System.out.println("\n*** Welcome to Bank of Pakistan ***");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Account Status");
            System.out.print("Select your choice: ");

            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit>0) {
                        balance+=deposit;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw=sc.nextDouble();
                    if (withdraw>0 && withdraw<=balance) {
                        balance-=withdraw;
                        System.out.println("Amount withdrawn successfully.");
                    } else if (withdraw>balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Account Status ---");
                    System.out.println("Username: " + username);
                    System.out.println("Current Balance: $" + String.format("%.2f", balance));
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1, 2, or 3.");
            }

            System.out.print("\nDo you want to continue? [y/Y]: ");
            continueChoice=sc.next().charAt(0);
            sc.nextLine();

        } while (continueChoice=='y' || continueChoice=='Y');

        System.out.println("Thank you for using Bank of Pakistan. Goodbye!");
        sc.close();
    }
}qq

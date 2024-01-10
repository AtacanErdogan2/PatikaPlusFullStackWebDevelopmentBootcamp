import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        String userName, password;
        int right = 3;
        int select;
        int balance = 20000;
        int amount;

        while (right > 0) {
            System.out.print("Username :");
            userName = input.nextLine();
            System.out.print("Password :");
            password = input.nextLine();

            if ((userName.equals("Atacan") && password.equals("Erdogan"))) {
                System.out.println("Welcome to our Bank :)");
                do {
                    System.out.println("1-Deposit\n2-Withdrawal\n3-Balance\n4-Exit");
                    System.out.print("Your choice :");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Enter the amount you want to deposit:");
                            amount = input.nextInt();

                            balance += amount;
                            System.out.println("Your new balance: " + balance);

                            break;

                        case 2:
                            System.out.print("Enter the amount you want to withdrawal:");
                            amount = input.nextInt();

                            if (amount > balance) {
                                System.out.println("Insufficient balance :(");
                            } else {
                                balance -= amount;
                                System.out.println("Your new balance: " + balance);
                            }

                            break;

                        case 3:
                            System.out.println("Your balance:" + balance);
                            break;

                    }
                } while (select != 4);

                System.out.println("Have a nice day :)");
                break;

            } else {
                right--;
                System.out.println("Incorrect username or password. Please try again.");

                if (right == 0) {
                    System.out.println("Your account has been blocked. Please make contact our bank.");
                } else {
                    System.out.println("Remaining: " + right);
                }
            }
        }
    }
}
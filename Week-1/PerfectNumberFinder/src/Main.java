import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int number;
        int total = 0;

        // Retrieving data from the user
        System.out.print("Please enter a number:");
        number = input.nextInt();

        // Calculation Section

        for (int i =1; i < number; i++) {
            if (number % i == 0) {
                total +=i;
            }
        }
        if (total == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

    }
}
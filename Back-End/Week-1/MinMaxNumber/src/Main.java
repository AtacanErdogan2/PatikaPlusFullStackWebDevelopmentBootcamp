import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int n, number;
        int minNumber = 0;
        int maxNumber = 0;


        // Retrieving data from the user
        System.out.print("How many numbers will you enter:");
        n = input.nextInt();

        // Calculation Section

        for (int i = 1; i <= n; i++) {
            System.out.print("Please enter the " + i + ". number :");
            number = input.nextInt();

            if (i == 1) {
                minNumber = number;
                maxNumber = number;
            } else {
                if (number < minNumber) {
                    minNumber = number;
                }
                if (number > maxNumber) {
                    maxNumber = number;
                }
            }
        }

        System.out.print("Min Number : " + minNumber + "\nMax Number : " + maxNumber);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int n;
        int counterFour = 0, counterFive = 0;

        // Retrieving data from the user
        System.out.print("Please enter the limit value : ");
        n = input.nextInt();

        // Calculation Section
        for (int i = 1; i <= n; i *= 4) {
            System.out.println("Powers of 4: " + i + " --> 4 to the " + counterFour + ". power");
            counterFour++;
        }

        for (int i = 1; i <= n; i *= 5) {
            System.out.println("Powers of 5: " + i + " --> 5 to the " + counterFive + ". power");
            counterFive++;
        }

    }
}

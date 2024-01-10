import java.util.Scanner;

public class Main {

    static void pattern(int number, int tempNumber, int sign) {

        if (tempNumber > number)
            return;

        if (tempNumber <= 0)
            sign *= -1;

        System.out.print(tempNumber + " ");

        pattern(number, tempNumber + sign * 5, sign);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int number;

        // Retrieving data from the user
        System.out.print("Please enter a number:");
        number = input.nextInt();

        // Calculation Section
        pattern(number, number, -1);

    }
}
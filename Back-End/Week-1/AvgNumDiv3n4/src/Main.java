import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int n;
        int counter = 0, sum = 0;


        // Retrieving data from the user
        System.out.print("To find the numbers that can be divided by 3 and 4 up to this number,\nPlease enter a number:");
        n = input.nextInt();

        // Calculation Section
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                counter++;
            }
        }

        System.out.println("Average of numbers divisible by 3 and 4: " + sum / counter);

    }
}
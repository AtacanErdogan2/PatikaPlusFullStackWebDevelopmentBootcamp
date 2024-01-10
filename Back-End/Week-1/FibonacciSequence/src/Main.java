import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int firstValue = 0;
        int secondValue = 1;
        int n, total;


        // Retrieving data from the user
        System.out.print("Enter the number of elements of the Fibonacci sequence:");
        n = input.nextInt();

        // Calculation Section

        for (int i = 1; i <= n + 1; i++) {           // --> n+1 was used cause the index value of first element is zero
            System.out.print(firstValue + " ");

            total = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = total;
        }

    }
}
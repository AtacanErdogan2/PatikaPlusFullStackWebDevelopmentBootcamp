import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int counter = 0;

        // Calculation Section

        for (int i = 2; i <= 100; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }

            if (counter == 0) {
                System.out.print(i + " ");
            }
            counter = 0;

        }

    }
}
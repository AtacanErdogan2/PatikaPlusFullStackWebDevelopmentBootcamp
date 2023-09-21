import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variable identification
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};

        // Retrieving data from the user
        System.out.print("Please enter a number:");
        int number = scan.nextInt();

        int closeMin = number;
        int closeMax = number;

        // Calculation Section
        Arrays.sort(array);

        for (int i:array) {
            if (i > number) {
                closeMin = i;
                break;
            }
        }

        for (int i = array.length-1; i >=0; i--) {
            if (array[i] < number) {
                closeMax = array[i];
                break;
            }
        }

        if(closeMax == number) {
            System.out.println("There is no number in the array smaller than the entered number.");
        } else {
            System.out.println("Closest number that smaller than your input is: " + closeMax);
        }

        if(closeMin == number) {
            System.out.println("There is no number in the array greater than the entered number.");
        } else {
            System.out.println("Closest number that greater than your input is: " + closeMin);
        }

    }
}
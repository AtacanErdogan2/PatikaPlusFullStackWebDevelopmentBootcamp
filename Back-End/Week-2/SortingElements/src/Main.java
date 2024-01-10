import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Retrieving data from the user
        System.out.print("Please enter the size of the array :");
        int listSize = scan.nextInt();
        int[] list = new int[listSize];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < listSize; i++) {
            System.out.print(i + 1 + ". number :");
            int number = scan.nextInt();
            list[i] = number;
        }

        int[] sortList = new int[listSize];

        for (int i = 0; i < list.length; i++) {

            int counter = listSize;

            for (int j = 0; j < list.length; j++) {
                if (list[i] < list[j]) {
                    counter--;
                }
            }

            sortList[counter - 1] = list[i];

        }

        System.out.println("Sorted Array : " + Arrays.toString(sortList));

    }
}
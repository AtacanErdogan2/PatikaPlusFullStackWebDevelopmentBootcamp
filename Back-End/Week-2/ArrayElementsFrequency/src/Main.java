import java.util.Scanner;

public class Main {
    static boolean isRepeated(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Frequency of Elements in the Array Calculator :)\n");
        System.out.print("Please enter a row size of the array:");
        int rowSize = scan.nextInt();

        int[] list = new int[rowSize];
        int elementList;

        for (int i = 0; i < list.length; i++) {
            System.out.print("[" + i + "] :");
            elementList = scan.nextInt();
            list[i] = elementList;
        }

        int counter;

        int[] duplicateList = new int[list.length];
        int duplicateCounter = 0;

        System.out.println("\nRepeated Numbers\n");

        for (int i = 0; i < list.length; i++) {

            counter = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    counter++;
                }
            }

            if (!isRepeated(duplicateList, list[i])) {
                duplicateList[duplicateCounter] = list[i];
                duplicateCounter++;
                System.out.println("The number " + list[i] + " was repeated " + counter + " times.");
            }

        }

    }
}

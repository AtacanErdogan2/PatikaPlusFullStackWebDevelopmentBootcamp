import java.util.Scanner;

public class Main {

    public static void getElementByIndex(int[] arr, int index) throws ArrayIndexOutOfBoundsException {

        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("\nYou entered an invalid index!!!");
        }

        System.out.println("\nArray[" + index + "] : " + arr[index]);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Please enter the index you want to print : ");
        int index = scan.nextInt();

        try {
            getElementByIndex(arr, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}

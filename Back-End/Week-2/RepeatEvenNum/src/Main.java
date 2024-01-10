public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {4, 11, 13, 4, 13, 8, 6, 11, 8, 4, 7, 8};
        int[] duplicate = new int[array.length];
        int counterIndex = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    if (array[i] % 2 == 0 && array[j] % 2 == 0) {
                        if (!isFind(duplicate, array[i])) {
                            duplicate[counterIndex++] = array[i];
                        }
                        break;
                    }
                }
            }
        }

        for (int i : duplicate) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
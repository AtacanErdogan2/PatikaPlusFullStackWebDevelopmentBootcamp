public class Main {
    public static void main(String[] args) {
        int[] array = {48, 75, 8, 23, 7, 29, 11};

        double harmonicSum = 0;

        for (int i = 0; i < array.length; i++) {
            harmonicSum += 1d / array[i];
        }

        double harmonicMean = array.length / harmonicSum;

        System.out.println("Harmonic mean : " + harmonicMean);

    }
}
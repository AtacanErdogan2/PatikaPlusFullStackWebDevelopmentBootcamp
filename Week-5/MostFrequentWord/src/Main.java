import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a text ↓");
        String text = scan.nextLine();

        // to separate words without case sensitivity
        String[] words = text.toLowerCase().split(" ");

        HashMap<String, Integer> frequency = new HashMap<>();

        // to add words to hashmap
        for (String word : words) {

            Integer counter = frequency.get(word);

            if (frequency.containsKey(word)) {
                frequency.put(word, counter + 1);
            } else {
                frequency.put(word, 1);
            }

        }

        int maxCounter = 0;

        // to set the highest value equal to maxCounter
        for (Integer value : frequency.values()) {

            if (value > maxCounter) {
                maxCounter = value;
            }
        }

        System.out.println("\nThe most frequently used word or words in the text ↓");

        // to print the key with the highest value
        for (String key : frequency.keySet()) {

            if (frequency.get(key) == maxCounter) {
                System.out.println(key);
            }

        }

    }
}

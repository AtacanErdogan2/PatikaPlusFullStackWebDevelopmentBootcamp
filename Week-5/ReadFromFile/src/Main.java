import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            String numbers = "5\n10\n20\n12\n33";
            //    String[] numbers = {"5", "10", "20", "12", "33"};
            File newFile = new File("numbers.txt");
            FileWriter input = new FileWriter(newFile);
            BufferedWriter output = new BufferedWriter(input);

//            for (String str : numbers) {
//                Arrays.stream(numbers).skip(numbers.length -1);
//                output.write(str + "\n");
//
//            }

            output.write(numbers);

            output.close();

            FileReader reader = new FileReader(newFile);
            BufferedReader bufferedReader = new BufferedReader(reader);

            int n = Integer.parseInt(bufferedReader.readLine());

            int sum = 0;

            while (n != -1) {
                sum += n;
                System.out.println(sum);
                n = Integer.parseInt(bufferedReader.readLine());
            }


            bufferedReader.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {

            String[] numbers = {"5", "10", "20", "12", "33"};
            File newFile = new File("numbers.txt");
            FileWriter input = new FileWriter(newFile);
            BufferedWriter output = new BufferedWriter(input);

            for (String str : numbers) {
                output.write(str + "\n");
            }

            output.close();

            FileReader reader = new FileReader(newFile);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            int sum = 0;

            while ((line = bufferedReader.readLine()) != null) {
                int n = Integer.parseInt(line);
                sum += n;
            }

            System.out.println(sum);
            bufferedReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

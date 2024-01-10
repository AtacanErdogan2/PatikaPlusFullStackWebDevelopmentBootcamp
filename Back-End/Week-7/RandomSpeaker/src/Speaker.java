import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;

public class Speaker {
    private static String fileName = "src/ogrencilistesi.txt";
    private static String speakerFileName = "src/SpeakerList.txt";
    private static String counterFileName = "src/counter.txt";
    private static LinkedHashMap<Integer, String> studentList = new LinkedHashMap<>();
    private static ArrayList<String> speakerList = new ArrayList<>();
    private static Random rand = new Random();
    private static File speakerFile = new File(speakerFileName);
    private static File counterFile = new File(counterFileName);
    private static FileReader fileReader;
    private static BufferedReader bufferedReader;
    private static FileWriter fileWriter;
    private static PrintWriter printWriter;
    private static FileWriter counterWriter;
    private static FileReader counterReader;
    private static BufferedReader bufferedCounterReader;
    private static PrintWriter printCounterWriter;
    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        String line;

        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            if (!speakerFile.exists()) {
                speakerFile.createNewFile();
            }

            if (!counterFile.exists()) {
                counterFile.createNewFile();
            }

            while ((line = bufferedReader.readLine()) != null) {

                if (line.length() < 3) {
                    studentList.put(Integer.valueOf(line), bufferedReader.readLine());
                }

            }

            int counter = 0;
            int randomSpeakerID;
            String speaker;
            String speakerLine;
            int select;

            fileReader = new FileReader(speakerFileName);
            bufferedReader = new BufferedReader(fileReader);


            while ((speakerLine = bufferedReader.readLine()) != null) {

                if (speakerLine.length() >= 3) {
                    speakerList.add(speakerLine);
                }

            }

            counterReader = new FileReader(counterFileName);
            bufferedCounterReader = new BufferedReader(counterReader);

            String counterLine;
            int maxCounter = 0;

            while ((counterLine = bufferedCounterReader.readLine()) != null) {

                if (Integer.valueOf(counterLine) > maxCounter) {
                    maxCounter = Integer.valueOf(counterLine);
                }

            }

            counter = maxCounter;

            while (counter <= studentList.size()) {
                fileWriter = new FileWriter(speakerFileName, true);
                printWriter = new PrintWriter(fileWriter);

                counterWriter = new FileWriter(counterFileName, true);
                printCounterWriter = new PrintWriter(counterWriter);


                randomSpeakerID = rand.nextInt(1, studentList.size() + 1);

                speaker = studentList.get(randomSpeakerID);

                while (speakerList.contains(speaker)) {
                    randomSpeakerID = rand.nextInt(1, studentList.size() + 1);
                    speaker = studentList.get(randomSpeakerID);
                }


                System.out.println("\nSpeaker : " + speaker);

                System.out.println("\nÖğrenci derste ve soruya yorum yaptı mı?\n" +
                        "1 - Evet 2- Hayır");

                select = scan.nextInt();

                switch (select) {
                    case 1:
                        printWriter.println(randomSpeakerID);
                        printWriter.println(speaker);
                        speakerList.add(speaker);
                        counter++;
                        printCounterWriter.println(counter);
                        break;
                    case 2:
                        System.out.println("\nBu kişi söz almadı!");
                        break;
                    default:
                        System.out.println("Yanlış bir değer girdiniz. Tekrar deneyiniz!");
                }

                printWriter.close();
                printCounterWriter.close();


                if (counter >= studentList.size()) {
                    System.out.println("Söz almayan öğrenci kalmamıştır. Programın yeniden başlatınız!");
                    fileWriter = new FileWriter(speakerFileName, false);
                    counterWriter = new FileWriter(counterFileName, false);
                    break;
                }

            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

public class SpeakerV2 {
    private static String fileName = "src/ogrencilistesi.txt";
    private static String speakerFileName = "src/speakerlist.txt";
    private static LinkedHashMap<Integer, String> studentList = new LinkedHashMap<>();
    private static ArrayList<String> speakerList = new ArrayList<>();
    private static Random rand = new Random();
    private static File speakerFile = new File(speakerFileName);
    private static FileReader fileReader;
    private static BufferedReader bufferedReader;
    private static FileReader speakerFileReader;
    private static BufferedReader bufferedSpeakerFileReader;
    private static FileWriter fileWriter;
    private static PrintWriter printWriter;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String line;

        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            if (!speakerFile.exists()) {
                speakerFile.createNewFile();
            }

            while ((line = bufferedReader.readLine()) != null) {

                if (line.length() < 3){
                    studentList.put(Integer.valueOf(line),bufferedReader.readLine());
                }

            }



            int counter = 0;
            int randomSpeakerID;
            String speaker;
            int select;

            while (counter <= studentList.size()){
                fileWriter = new FileWriter(speakerFileName,true);
                printWriter = new PrintWriter(fileWriter);
                speakerFileReader = new FileReader(speakerFileName);
                bufferedSpeakerFileReader = new BufferedReader(speakerFileReader);

                randomSpeakerID = rand.nextInt(1, studentList.size() + 1);

                speaker = studentList.get(randomSpeakerID);

                if (speakerList.contains(speaker)){
                    continue;
                }


//                    System.out.println("Söz almayan kişi kalmamıştır. Lütfen programı yeniden çalıştırınız!");
//                    if (speakerList.size() >= studentList.size()){
//                        speakerList.clear();
//                        speakerFile.delete();
//                }

                    System.out.println("Speaker : " + speaker);
                    System.out.println("Öğrenci derste ve soruya yorum yaptı mı?\n" +
                            "1 - Evet 2 - Hayır");
                    select = scan.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Evet");
                            printWriter.println(randomSpeakerID);
                            printWriter.println(speaker);
                            speakerList.add(speaker);
                            break;
                        case 2:
                            System.out.println("Hayır");
                            break;
                        default:
                            System.out.println("Hayır");
                    }

                    printWriter.close();

                    counter++;

            }




        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[9][7];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if ((i == 0 && j != letter[i].length - 1) || (i == 8 && j != letter[i].length - 1) || (i == 4 && j < letter[i].length - 2)) {
                    letter[i][j] = " * ";
                } else if (j == 0 || (i == 3 && j == 5) || (i == 5 && j == 5)) {
                    letter[i][j] = " * ";
                } else if ((i == 1 && j == 6) || (i == 2 && j == 6) || (i == 6 && j == 6) || (i == 7 && j == 6)) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }


    }
}
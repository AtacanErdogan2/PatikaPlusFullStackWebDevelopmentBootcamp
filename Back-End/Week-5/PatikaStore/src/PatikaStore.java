import java.util.Scanner;

public class PatikaStore {
    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nPatika Store Product Management Dashboard\n");
        boolean isRun = true;
        while (isRun) {
            System.out.println("1-Notebook Operations");
            System.out.println("2-Phone Operations");
            System.out.println("3-List Brands");
            System.out.println("0-Exit");
            System.out.println("--------------------------------");
            System.out.print("Your choice : ");
            int selected = input.nextInt();


            switch (selected) {
                case 1:
                    Notebook.notebookMenu();
                    break;
                case 2:
                    SmartPhone.phoneMenu();
                    break;
                case 3:
                    Brand.printBrands();
                    System.out.println();
                    break;
                case 0:
                    isRun = false;
                    break;
                default:
                    System.out.println("Invalid Entry");
            }

        }

    }
}
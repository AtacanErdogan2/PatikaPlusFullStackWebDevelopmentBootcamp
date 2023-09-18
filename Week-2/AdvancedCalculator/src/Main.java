import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner input = new Scanner(System.in);
        int number;
        int result = 0, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter :");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = input.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter :");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You can't enter the divisor 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the base value :");
        int base = input.nextInt();
        System.out.print("Please enter the exponent value :");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.println(" a mod n ");
        System.out.print("--> a : ");
        int a = input.nextInt();
        System.out.print("--> n : ");
        int n = input.nextInt();

        int mod = a % n;
        System.out.println("Result : " + mod);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of the first side (in cm) : ");
        int n1 = input.nextInt();
        System.out.print("Please enter the length of the second side(in cm) : ");
        int n2 = input.nextInt();

        int area = n1 * n2;
        int perimeter = 2 * (n1 + n2);

        System.out.println("Area --> " + area + " cm^2 " + " Perimeter --> " + perimeter + " cm");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int select;
        String menu = """
                1)Addition
                2)Subtraction
                3)Multiplication
                4)Division
                5)Exponent calculation
                6)Factorial calculation
                7)Modulus calculation
                8)Rectangle area and perimeter calculation
                0)Exit""";

        System.out.println(menu);


        // Retrieving data from the user

        do {

            System.out.print("Your choice :");
            select = input.nextInt();

            switch (select) {
                case 1 -> plus();
                case 2 -> minus();
                case 3 -> times();
                case 4 -> divided();
                case 5 -> power();
                case 6 -> factorial();
                case 7 -> mod();
                case 8 -> rectangle();
                case 0 -> System.out.println("Thank you for using this program :)");
                default -> System.out.println("You entered incorrect data");
            }

        } while (select != 0);

    }
}
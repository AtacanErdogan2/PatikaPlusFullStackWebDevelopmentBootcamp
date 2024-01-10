public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 10, 120, 95, 60);
        Fighter f2 = new Fighter("Mike Tyson", 15, 100, 100, 40);

        Match match = new Match(f1, f2, 90, 100);
        match.run();

    }
}
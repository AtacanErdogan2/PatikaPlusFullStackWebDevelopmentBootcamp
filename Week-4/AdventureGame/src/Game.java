import java.util.Scanner;

public class Game {

    private Scanner scan = new Scanner(System.in);

    // To start the game
    public void start() {

        System.out.println("=========ADVENTURE GAME=========");
        System.out.print("Please enter a name:");
        String playerName = scan.nextLine();
        Player player = new Player(playerName);
        System.out.println("Hey " + player.getUserName() + " your story begins!!! \n");
        System.out.println("You opened your eyes and realised you were on an island." +
                "\nSuddenly, a mysterious old man appeared in front of you.\n" +
                "\nOld Man : Hey " + player.getUserName() + " . You're on a lost island. You need to be strong to get out of here. Because there are many creatures here. And if you face them like this, you'll be dead before long." +
                "\n" + player.getUserName() + " : Wait, how do you know my name? And how did I get here? I don't remember anything." +
                "\nOld Man : In time, you'll find answers to all your questions. But right now your time is limited. You must choose a character as soon as possible. " +
                "\n" + player.getUserName() + " : Who the hell are you? What are you talking about?" +
                "\nOld Man : If you want to stay alive, shut up and do as I say. Choose one of these characters and find a way off this island ↓\n");

        player.selectCharacter();

        System.out.println("\nOld Man : Nice choice. Now is not the time to stand still, you need to take action." +
                "\n" + player.getUserName() + " : Okay, I guess. But where am I supposed to go?" +
                "\nOld Man : Well, There are three zones on this island. Cave, forest and river... " +
                "\nOld Man : From these areas you need to collect items to get off the island... " +
                "\nOld Man : But you have to be careful because strange creatures are guarding these items!!!");
        System.out.println(player.getUserName() + " : How long have you been here and you haven't collected these? Anyway, I don't even want to know your answer. I'd better start the journey.");
        System.out.println("Old Man : Before I forget, there may be various items in the mine that you may find useful.");
        System.out.println("Old Man : After you've collected all the items, visit me at the safe house and we'll get off this island!!!");
        System.out.println(player.getUserName() + " : Oh, you bet I will!");

        Location location = null;

        while (true) {

            player.printInfo();
            System.out.println("\n=========TRAVEL=========\n");
            System.out.println("""
                    0 → Exit Game
                    1 → Safe House \t→ Renews your health.
                    2 → Store \t\t→ You can purchase weapons or armor.
                    3 → Cave \t\t→ This path leads to the cave. \t\tEnemy Zone!
                    4 → Jungle \t\t→ This path leads to the jungle. \tEnemy Zone!
                    5 → River \t\t→ This path leads to the river. \tEnemy Zone!
                    6 → Mine \t\t→ This path leads to the mine. \t\tEnemy Zone!
                    """);
            System.out.println("========================");

            System.out.print("\nSelect the location you want to travel : ");
            int selectLocation = scan.nextInt();

            while (!(selectLocation >= 0 && selectLocation <= 6)) {
                System.out.print("Please select a valid location : ");
                selectLocation = scan.nextInt();
            }

            switch (selectLocation) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new Store(player);
                    break;
                case 3:
                    if (player.getInventory().isFood()) {
                        System.out.println("\nOld Man : You've collected everything in here kiddo, you should go to the other zones without wasting time.");
                        System.out.println(player.getUserName() + " : When did this man get here? I think I have to go to other zones!!!");
                        continue;
                    }
                    location = new Cave(player);
                    break;
                case 4:
                    if (player.getInventory().isFirewood()) {
                        System.out.println("\nOld Man : You've collected everything in here kiddo, you should go to the other zones without wasting time.");
                        System.out.println(player.getUserName() + " : When did this man get here? I think I have to go to other zones!!!");
                        continue;
                    }
                    location = new Jungle(player);
                    break;
                case 5:
                    if (player.getInventory().isWater()) {
                        System.out.println("\nOld Man : You've collected everything in here kiddo, you should go to the other zones without wasting time.");
                        System.out.println(player.getUserName() + " : When did this man get here? I think I have to go to other zones!!!");
                        continue;
                    }
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            // To exit the game
            if (location == null) {
                System.out.println("\nYou're exiting the game. Unfortunately I can't save your progress, my programming knowledge is not there yet :(");
                break;
            }

            // (1) Controls to finish the game
            if (location.getName().equals("Safe House") && player.getInventory().isFood() && player.getInventory().isFirewood() && player.getInventory().isWater()) {
                System.out.println("\n" + player.getUserName() + " : I got everything you asked for. Now tell me how to get off this damn island.");
                System.out.println("Old Man : ...");
                System.out.println(player.getUserName() + " : Come on, man...");
                System.out.println("Old Man : Wake up, kiddo. We're getting late.");
                System.out.println(player.getUserName() + " : Wait, what!!! Grandpa is that you!!!");
                System.out.println("Grandpa : Of course it's me. You sleepyhead.");
                System.out.println(player.getUserName() + " : So, what, this is all just a dream?");
                System.out.println("Grandpa : I think you had a nightmare, kiddo.");
                System.out.println(player.getUserName() + " : It's only 5 o'clock, Grandpa.");
                System.out.println("Grandpa : Yes, kiddo or did you forget we're going fishing on the island?");
                System.out.println(player.getUserName() + " : What!!! island? I don't think I'm going to any island after this!!!");
                System.out.println("\n==================THE END==================");
                break;
            }

            if (!location.onLocation()) {
                System.out.println("\nYOU ARE DEAD ! GAME OVER !!");
                break;
            }

        }

    }

}


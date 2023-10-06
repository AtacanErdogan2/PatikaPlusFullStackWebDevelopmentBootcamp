public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(player, 1, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\nOld Man : Welcome to the safe house, kiddo.");
        System.out.println("Old Man : If you're hungry, I can cook for you. Do you want to eat?");
        System.out.println("Y → Yes N → No");
        System.out.print("Your choice :");
        String select = scan.nextLine().toUpperCase();
        if (select.equals("Y")) {
            System.out.println("\nOld Man : Enjoy your meal. This dish will improve your health.");
            System.out.println(this.getPlayer().getUserName() + " : Thanks I guess...");
            this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        } else {
            System.out.println("\nOld Man : So you're full. I don't know if I'll ever cook for you again.");
            System.out.println(this.getPlayer().getUserName() + " : What an insufferable old man...");
        }
        return true;
    }
}

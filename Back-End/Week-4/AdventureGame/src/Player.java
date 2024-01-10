import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String userName;
    private String characterName;
    private Inventory inventory;
    private Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.userName = name;
        this.inventory = new Inventory();
    }

    public void selectCharacter() {
        GameCharacters[] charactersList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("=========CHARACTERS=========");
        for (GameCharacters i : charactersList) {
            System.out.println(i.getId() + " →\t " + " Character : " + i.getName() + " \t Damage : " + i.getDamage() + " \t Health : " + i.getHealth() + "  \t Money : " + i.getMoney() + "$");
        }
        System.out.println("============================\n");

        System.out.print("Select a character : ");
        int selectCharacter = scan.nextInt();

        while (!(selectCharacter > 0 && selectCharacter <= 3)) {
            System.out.print("Please select a valid character : ");
            selectCharacter = scan.nextInt();
        }

        switch (selectCharacter) {
            case 1:
                playerFeatures(new Samurai());
                break;
            case 2:
                playerFeatures(new Archer());
                break;
            case 3:
                playerFeatures(new Knight());
                break;
            default:
                playerFeatures(new Samurai());
        }

    }

    public void playerFeatures(GameCharacters gameCharacters) {
        this.setDamage(gameCharacters.getDamage());
        this.setHealth(gameCharacters.getHealth());
        this.setOriginalHealth(gameCharacters.getHealth());
        this.setMoney(gameCharacters.getMoney());
        this.setCharacterName(gameCharacters.getName());
    }

    public void printInfo() {
        System.out.println("\n=========YOUR CHARACTER=========");
        System.out.println(this.getCharacterName() + " Weapon : " + this.getInventory().getWeapon().getName() + " Damage : " + this.getTotalDamage() +
                " Armor : " + this.getInventory().getArmor().getName() + " Block : " + this.getInventory().getArmor().getBlock() + " Health : " + this.getHealth() + " Money : " + this.getMoney() + "$");
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}

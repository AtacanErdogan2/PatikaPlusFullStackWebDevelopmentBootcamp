import java.util.Random;

public abstract class BattleLocation extends Location {
    private Enemy enemy;
    private String loot;
    private int maxEnemy;

    public BattleLocation(Player player, int id, String name, Enemy enemy, String loot, int maxEnemy) {
        super(player, id, name);
        this.enemy = enemy;
        this.loot = loot;
        this.maxEnemy = maxEnemy;
    }

    @Override
    public boolean onLocation() {
        int enemyNumber = this.randomEnemyNumber();

        System.out.println("\nYou are in the " + this.getName() + "!");
        System.out.println("Be careful! There are " + enemyNumber + " " + this.getEnemy().getName() + " in this place !!");
        System.out.println("Defeat the enemies here and you will be rewarded with " + this.getLoot() + "!");
        System.out.println("\nWhat do you want to do?");
        System.out.println("\nB → Battle " + " R → Run");
        System.out.print("\nYour choice :");

        String selectCase = scan.nextLine().toUpperCase();

        if (selectCase.equals("B") && combat(enemyNumber)) {
            System.out.println("\nYou have defeated all the enemies in the " + this.getName() + "!!!");

            // (3) Randomly dropping items from the enemy
            if (this.enemy.getId() == 4) {

                Python item = new Python();

                switch (item.dropType()) {
                    case 1:
                        Weapon droppedWeapon = item.dropWeapon();
                        System.out.println("\n" + droppedWeapon.getName() + " added to your Inventory!");
                        this.getPlayer().getInventory().setWeapon(droppedWeapon);
                        break;
                    case 2:
                        Armor droppedArmor = item.dropArmor();
                        System.out.println("\n" + droppedArmor.getName() + " Armor added to your Inventory!");
                        this.getPlayer().getInventory().setArmor(droppedArmor);
                        break;
                    case 3:
                        int droppedMoney = item.dropMoney() * enemyNumber;
                        System.out.println("!!! " + droppedMoney + "$ added to your inventory !!!");
                        this.getPlayer().setMoney(this.getPlayer().getMoney() + droppedMoney);
                        break;
                    case 4:
                        System.out.println("\nUnfortunately, no items or money dropped from the enemy.");
                        break;
                }
            }

            // (1) Add location-specific rewards to player inventory
            if (this.loot.equals("Food") && !player.getInventory().isFood()) {
                System.out.println("\n" + this.loot + " added to your Inventory!");
                player.getInventory().setFood(true);
            } else if (this.loot.equals("Firewood") && !player.getInventory().isFirewood()) {
                System.out.println("\n" + this.loot + " added to your Inventory!");
                player.getInventory().setFirewood(true);
            } else if (this.loot.equals("Water") && !player.getInventory().isWater()) {
                System.out.println("\n" + this.loot + " added to your Inventory!");
                player.getInventory().setWater(true);
            }

            return true;
        }

        // Character health check
        if (this.getPlayer().getHealth() <= 0) {
            return false;
        }

        return true;

    }

    // (3) For each python to have different damage
    public static int randomDamage() {
        Random random = new Random();
        return random.nextInt(3, 7);
    }

    // Combat algorithm
    public boolean combat(int enemyNumber) {

        for (int i = 1; i <= enemyNumber; i++) {

            // (3) Checking whether the enemy is a python or not
            if (this.getEnemy().getId() == 4) {
                this.getEnemy().setDamage(randomDamage());
            }

            this.getEnemy().setHealth(this.getEnemy().getOriginalHealth());

            playerStats();
            enemyStats(i);

            while (this.getPlayer().getHealth() > 0 && this.getEnemy().getHealth() > 0) {

                System.out.println("\nH → Hit " + " R → Run");
                System.out.print("\nYour choice :");
                String selectCombat = scan.nextLine().toUpperCase();

                if (selectCombat.equals("H")) {

                    // (2) 50% chance to determine who makes the first move when the player encounters an enemy
                    if (Math.random() <= 0.5) {

                        System.out.println("\n" + this.getPlayer().getUserName() + " hits the " + this.getEnemy().getName());
                        enemy.setHealth(this.getEnemy().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();

                        if (this.getEnemy().getHealth() > 0) {

                            System.out.println("\n" + this.getEnemy().getName() + " hits the " + this.getPlayer().getUserName());
                            int enemyDamage = this.getEnemy().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();

                            if (enemyDamage < 0) {
                                enemyDamage = 0;
                            }

                            this.getPlayer().setHealth(this.getPlayer().getHealth() - enemyDamage);
                            afterHit();
                        }

                    } else {

                        if (this.getEnemy().getHealth() > 0) {

                            System.out.println("\n" + this.getEnemy().getName() + " hits the " + this.getPlayer().getUserName());
                            int enemyDamage = this.getEnemy().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();

                            if (enemyDamage < 0) {
                                enemyDamage = 0;
                            }

                            this.getPlayer().setHealth(this.getPlayer().getHealth() - enemyDamage);
                            afterHit();

                        }

                        System.out.println("\n" + this.getPlayer().getUserName() + " hits the " + this.getEnemy().getName());
                        enemy.setHealth(this.getEnemy().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();

                    }

                } else {
                    return false;
                }

            }

            if (getPlayer().getHealth() > getEnemy().getHealth()) {
                System.out.println("\n!!! You killed " + i + ". " + this.getEnemy().getName() + " in the " + this.getName() + " !!!");
                System.out.println("!!! " + this.getEnemy().getPrize() + "$ added to your inventory !!!");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getEnemy().getPrize());
            } else {
                return false;
            }

        }

        return true;

    }

    public void playerStats() {
        System.out.println("\n=========PLAYER STATUS=========");
        System.out.println(" Armor : " + this.getPlayer().getInventory().getArmor().getName() +
                " Block : " + this.getPlayer().getInventory().getArmor().getBlock() +
                " Health : " + this.getPlayer().getHealth() +
                " Weapon : " + this.getPlayer().getInventory().getWeapon().getName() +
                " Damage : " + this.getPlayer().getTotalDamage());
    }

    public void enemyStats(int i) {
        System.out.println("\n=========ENEMY STATUS=========");
        System.out.println("========== " + i + ". " + this.getEnemy().getName() + "==========");
        System.out.println("Health : " + this.getEnemy().getHealth() +
                " Damage : " + this.getEnemy().getDamage() +
                " Prize  : " + this.getEnemy().getPrize() + "$");
    }

    public void afterHit() {
        System.out.println("\nYour Health : " + this.getPlayer().getHealth());
        System.out.println(this.getEnemy().getName() + " Health : " + this.getEnemy().getHealth());
        System.out.println("==================");
    }

    public int randomEnemyNumber() {
        Random random = new Random();
        return random.nextInt(this.getMaxEnemy()) + 1;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public String getLoot() {
        return loot;
    }

    public void setLoot(String loot) {
        this.loot = loot;
    }

    public int getMaxEnemy() {
        return maxEnemy;
    }

    public void setMaxEnemy(int maxEnemy) {
        this.maxEnemy = maxEnemy;
    }

}

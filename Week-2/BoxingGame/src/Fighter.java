public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double block;

    Fighter(String name, int damage, int health, int weight, double block) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (block >= 0 && block <= 100) {
            this.block = block;
        } else {
            this.block = 0;
        }
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " hit " + foe.name + " for " + this.damage + " damage.");
        if (foe.isBlock()) {
            System.out.println(foe.name + " blocked the hit.");
            System.out.println("---------------------");
            return foe.health;
        } else {
            System.out.println(foe.name + " suffered " + this.damage + " points health losses.");
            System.out.println("---------------------");
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isBlock() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.block;
    }

}

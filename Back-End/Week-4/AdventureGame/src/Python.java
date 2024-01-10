import java.util.Random;

public class Python extends Enemy {
    static Random rand = new Random();

    public Python() {
        super(4, "Python", 0, 12, 0);
    }



    // (3) For items dropped from defeated enemies
    public int dropType() {
        int dropTypeChance = rand.nextInt(1, 101);

        if (dropTypeChance <= 15) {
            return 1;
        } else if (dropTypeChance <= 30) {
            return 2;
        } else if (dropTypeChance <= 55) {
            return 3;
        } else {
            return 4;
        }

    }

    public Weapon dropWeapon() {
        int dropWeaponChance = rand.nextInt(1, 101);

        if (dropWeaponChance <= 50) {
            return Weapon.getWeaponObjectByID(1);
        } else if (dropWeaponChance <= 80) {
            return Weapon.getWeaponObjectByID(2);
        } else {
            return Weapon.getWeaponObjectByID(3);
        }

    }

    public Armor dropArmor() {
        int dropArmorChance = rand.nextInt(1, 101);

        if (dropArmorChance <= 50) {
            return Armor.getArmorObjectByID(1);
        } else if (dropArmorChance <= 80) {
            return Armor.getArmorObjectByID(2);
        } else {
            return Armor.getArmorObjectByID(3);
        }

    }

    public int dropMoney() {
        int dropMoneyChance = rand.nextInt(1, 101);

        if (dropMoneyChance <= 50) {
            return 1;
        } else if (dropMoneyChance <= 80) {
            return 5;
        } else {
            return 10;
        }

    }

}

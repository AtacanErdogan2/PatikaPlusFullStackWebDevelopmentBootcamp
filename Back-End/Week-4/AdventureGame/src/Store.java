public class Store extends NormalLocation {
    public Store(Player player) {
        super(player, 2, "Store");
    }

    @Override
    public boolean onLocation() {

        System.out.println("\nOld Man : Welcome to the store, kiddo. What do you want to do?");
        boolean showMenu = true;

        while (showMenu) {

            System.out.println("\n============STORE===========");
            System.out.println("\n1 → Weapons" +
                    "\n2 → Armors" +
                    "\n3 → Exit");
            System.out.print("\nYour choice : ");
            int selectStore = scan.nextInt();

            while (!(selectStore > 0 && selectStore <= 3)) {
                System.out.print("\nYou have made an invalid selection. " +
                        "}\nPlease make a new selection :");
                selectStore = scan.nextInt();
            }

            switch (selectStore) {
                case 1:
                    printWeapon();
                    purchaseWeapon();
                    break;
                case 2:
                    printArmor();
                    purchaseArmor();
                    break;
                case 3:
                    System.out.println("\nOld Man : Take care of yourself, kiddo.");
                    showMenu = false;
                    break;
            }

        }

        return true;

    }

    public void printWeapon() {
        System.out.println("\n============WEAPONS===========");

        for (Weapon i : Weapon.weapons()) {
            System.out.println(i.getId() + " → " + i.getName() + " Damage : +" + i.getDamage() + " Price : " + i.getPrice() + "$");
        }

        System.out.println("4 → Exit");

    }

    public void purchaseWeapon() {
        System.out.print("\nSelect a weapon :");
        int selectWeapon = scan.nextInt();

        while (!(selectWeapon > 0 && selectWeapon <= Weapon.weapons().length + 1)) {
            System.out.print("\nYou have made an invalid selection. " +
                    "}\nPlease make a new selection :");
            selectWeapon = scan.nextInt();
        }

        if (selectWeapon != 4) {
            Weapon selectedWeapon = Weapon.getWeaponObjectByID(selectWeapon);

            if (selectedWeapon != null) {

                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("You don't have enough money to purchase this gun");
                } else {
                    System.out.println("The " + selectedWeapon.getName() + " purchase was successfully completed.");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your remaining funds : " + this.getPlayer().getMoney() + "$");
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }

            }

        }

    }

    public void printArmor() {
        System.out.println("\n============ARMORS============");

        for (Armor i : Armor.armors()) {
            System.out.println(i.getId() + " → " + i.getName() + " Block : +" + i.getBlock() + " Price : " + i.getPrice() + "$");
        }

        System.out.println("4 → Exit");

    }

    public void purchaseArmor() {

        System.out.print("\nSelect a armor :");
        int selectArmor = scan.nextInt();

        while (!(selectArmor > 0 && selectArmor <= Armor.armors().length + 1)) {
            System.out.print("\nYou have made an invalid selection. " +
                    "\nPlease make a new selection :");
            selectArmor = scan.nextInt();
        }

        if (selectArmor != 4) {
            Armor selectedArmor = Armor.getArmorObjectByID(selectArmor);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("You don't have enough money to purchase this armor");
                } else {
                    System.out.println("The " + selectedArmor.getName() + " purchase was successfully completed.");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your remaining funds : " + this.getPlayer().getMoney() + "$");
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }

            }

        }

    }

}

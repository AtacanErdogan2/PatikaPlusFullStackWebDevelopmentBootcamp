import java.util.Scanner;

public abstract class Location {
    protected Player player;
    private int id;
    private String name;
    public static Scanner scan = new Scanner(System.in);


    public Location(Player player, int id, String name) {
        this.player = player;
        this.id = id;
        this.name = name;
    }

    public abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

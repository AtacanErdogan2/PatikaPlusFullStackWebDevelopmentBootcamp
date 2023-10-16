import java.util.ArrayList;


public class Team {
    private String name;
    public static final ArrayList<Team> teams = new ArrayList<>();
    public static final ArrayList<Team> tempTeams = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    static {
        teams.add(new Team("Fenerbahçe"));
        teams.add(new Team("Galatasaray"));
        teams.add(new Team("Beşiktaş"));
        teams.add(new Team("Trabzonspor"));
        teams.add(new Team("Bursaspor"));
        teams.add(new Team("Başakşehir"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

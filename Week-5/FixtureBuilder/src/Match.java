import java.util.ArrayList;
import java.util.Random;

public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private static final ArrayList<Match> matches = new ArrayList<>();
    private static final ArrayList<Match> tempMatches = new ArrayList<>();
    private static final Random random = new Random();

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public static void run() {
        matchGenerator();
        print();
    }

    public static void matchGenerator() {

        int homeTeamId = random.nextInt(Team.teams.size());
        int awayTeamId = random.nextInt(Team.teams.size());

        while (awayTeamId == homeTeamId) {
            awayTeamId = random.nextInt(Team.teams.size());
        }

        Team.tempTeams.add(Team.teams.get(homeTeamId));
        Team.tempTeams.add(Team.teams.get(awayTeamId));

        matches.add(new Match(Team.teams.get(homeTeamId), Team.teams.get(awayTeamId)));
        tempMatches.addAll(matches);

        if (Team.tempTeams.contains(Team.teams.get(homeTeamId)) && Team.tempTeams.contains(Team.teams.get(awayTeamId))) {
            homeTeamId = random.nextInt(Team.teams.size());
            awayTeamId = random.nextInt(Team.teams.size());
        }

        Team.tempTeams.add(Team.teams.get(homeTeamId));
        Team.tempTeams.add(Team.teams.get(awayTeamId));

        matches.add(new Match(Team.teams.get(homeTeamId), Team.teams.get(awayTeamId)));
        tempMatches.addAll(matches);

    }

    public static void print() {
        for (Match m : matches) {
            System.out.println(m.getHomeTeam().getName() + " vs " + m.getAwayTeam().getName());
        }

        for (Match tm : tempMatches) {
            System.out.println(tm.getHomeTeam().getName() + " vs " + tm.getAwayTeam().getName());
        }
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
}

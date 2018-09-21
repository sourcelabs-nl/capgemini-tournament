import java.util.ArrayList;
import java.util.List;

class TournamentController {

    private final List<Team> teams;

    TournamentController(List<Team> teams) {
        if (teams.size() % 8 != 0) {
            throw new RuntimeException("Nr of teams must be dividable by 8");
        }
        this.teams = teams;
    }

    void playTournament() {
        List<Team> teams = playRound(this.teams);
        teams.get(0).celebrate();
    }

    private Team playMatch(Team team1, Team team2) {

        int teamOneGoals = 0;
        int teamTwoGoals = 0;

        while (true) {
            teamOneGoals += team1.scoreGoals();
            teamTwoGoals += team2.scoreGoals();

            if (teamOneGoals > teamTwoGoals) {
                System.out.println(team1.getName() + " defeated " + team2.getName() + "\n");
                return team1;
            } else if (teamTwoGoals > teamOneGoals) {
                System.out.println(team2.getName() + " defeated " + team1.getName() + "\n");
                return team2;
            }
        }


    }

    private List<Team> playRound(List<Team> teams) {
        int nrOfGames = teams.size() / 2;
        System.out.println("Playing round with " + nrOfGames + " games");

        List<Team> teamsLeft = new ArrayList<>();
        for (int i = 0; i < teams.size(); i++) {
            Team winningTeam = playMatch(teams.get(i), teams.get(++i));
            teamsLeft.add(winningTeam);
        }

        if (teamsLeft.size() > 1) {
            System.out.println("\n");
            return playRound(teamsLeft);
        }

        return teamsLeft;
    }
}

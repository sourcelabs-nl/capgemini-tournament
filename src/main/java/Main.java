import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        teams.add(new AmatureTeam("Team 1", "Bear", "Clubhouse"));
        teams.add(new AmatureTeam("Team 2", "Dog", "Clubhouse"));
        teams.add(new AmatureTeam("Team 3", "Bull", "Clubhouse"));
        teams.add(new AmatureTeam("Team 4", "Eagle", "Clubhouse"));

        teams.add(new ProfessionalTeam("Team 5", "New York times"));
        teams.add(new ProfessionalTeam("Team 6", "Apple"));
        teams.add(new ProfessionalTeam("Team 7", "Google"));
        teams.add(new ProfessionalTeam("Team 8", "Capgemini"));

        TournamentController tournamentController = new TournamentController(teams);
        tournamentController.playTournament();
    }
}
